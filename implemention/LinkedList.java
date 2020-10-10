package basics;

public class LinkedList {
	Node head= null;
	class Node 
	{
		int val;
		Node next;
		Node(int x)
		{
			val=x;
			next=null;
		}
	}
	
	void add(int x)
	{
		Node node = new Node(x);
		if(head==null)
		{
			head= node;
		}
		else 
		{
			Node curr=head;
			while(curr.next!=null) curr=curr.next;
			curr.next= node;
		}
		
	}
	
	void addFirst(int x)
	{
		Node node = new Node(x);
		if(head==null)
		{
			head= node;
		}
		
		{
			node.next= head;
			head=node;
		}
	}
	
	void add(int index,int x)
	{
		if(index==0)
		{
			addFirst(x);
		}
		else 
		{
			try
			{
				Node curr= head;
				for(int i=1;i<index;i++)
				{
					curr=curr.next;
					
				}
				Node temp= curr.next;
				curr.next=new Node(x);
				curr.next.next=temp;
			}
			catch(Exception e )
			{
				System.out.println("not valid");
			}
			
		}
	}
	
	void print()
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print( curr.val+"==> ");
			curr=curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(2);ll.print();
		ll.addFirst(3);ll.print();
		ll.add(2, 3);ll.print();
		ll.add(1,5);
		ll.print();

	}

}
