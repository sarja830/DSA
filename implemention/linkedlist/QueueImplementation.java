package linkedlist;

public class QueueImplementation {
	Node front,rear,s,j;
	
	

public class Node {
	int value;
	Node next;
	public Node(int key)
	{
		value=key;
		next=null;
	}
}


	public void enqueue(int key)
	{
		Node temp = new Node(key);
		if(front==null)
		{
			front= temp;
			rear=front;
		}
		else
		{
			rear.next=temp;
			rear=temp;
		}
	}
	
	public void show()
	{
		Node currptr=front;
		if(currptr==null) System.out.println("empty");
		while(currptr!=null)
		{
			System.out.print(" "+currptr.value+" ");
			
			currptr=currptr.next;
		}
	}
	
	public int dequeue()
	{
		if(rear==null)
		{
			return -1;
		}
		else if(front==rear)
		{
			s=front;
			front=rear=null;
			return s.value;
		}
		else
		{
			s=front;
			j=front.next;
			front.next=null;
			front=j;
			return s.value;
		}
	}
	
	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		q.show();
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.show();
		System.out.print("\n");
		System.out.println(q.front.value);
		System.out.println(q.rear.value);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.show();
		System.out.print("\n");
		System.out.println(q.front.value);
		System.out.println(q.rear.value);
		q.show();System.out.print("\n");
		q.dequeue();q.show();System.out.print("\n");
		q.dequeue();q.show();System.out.print("\n");
		q.dequeue();q.show();System.out.print("\n");
		q.dequeue();q.show();System.out.print("\n");
		q.enqueue(12);q.show();System.out.print("\n");
		q.dequeue();q.show();System.out.print("\n");
	}

}


