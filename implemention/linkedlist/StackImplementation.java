package linkedlist;

public class StackImplementation {

public class Node {
	int value;
	Node next;
	public Node(int key)
	{
		value=key;
		next=null;
	}
}

	Node head;
	void push(int key)
	{
		Node a = new Node(key);
		if(head==null)
		{
			head=a;
			
		}
		else
		{
			a.next=head;
			head=a;
			
		}
	}
	void show()
	{Node currptr=head;
		while(currptr!=null)
		{
			System.out.print(currptr.value+" ");
			currptr=currptr.next;
		}
		System.out.println();
	}
	int pop()
	{	Node s;
		if(head==null) return -1;
		
		else {
			s=head;
			head=head.next;
		}
		return s.value;
		
		
	}
	int peek()
	{
		if(head==null) return -1;
		return head.value;
		
	}
	public static void main(String args[]) {
		
		StackImplementation stack =  new StackImplementation();
		stack.push(0);
		stack.push(1);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		stack.pop();
		stack.pop();
		stack.show();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.push(12);
		stack.push(13);
		stack.show();
	}
}
