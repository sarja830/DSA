package basics.implemention;

public class PriorityQueueUsingHeap {

	int a[]= new int[100];
	int siz;
	
	PriorityQueueUsingHeap()
	{
		siz=0;
	}
	
	public void maxHeapify(int n , int i , int[] a)
	{
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[largest]<a[l])  largest= l;
		if(r<n && a[largest]<a[r])	largest= r ;
		
		if(largest!=i)
		{
			int temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;
			maxHeapify(n,largest,a);
		}
	}
	
	public int parent(int i, int a[])
	{
		if(i/2>=0) return i/2;
		else return -1;
	}
	
	public void increaseKey(int i,int key , int a[])
	{
		a[i]=key;
		while(i>=1 && a[parent(i,a)]<a[i])
		{
			
			int temp=a[i];
			a[i]=a[parent(i,a)];
			a[parent(i,a)]=temp;
			i=parent(i,a);
			
		}
	}
	
	public void decreasekey(int i , int key , int a[])
	{
		a[i]=key;
		maxHeapify(a.length,i,a);
	}
	
	public int maximum(int a[])
	{
		return a[0];
	}
	
	public int poll(int a[])
	{
		try {
		int n =siz;
		int temp = a[0];
		a[0] = a[n-1];
		a[n-1] = temp;
		maxHeapify(n-1,0,a);
		siz--;
		return temp;
		}
		catch(Exception e)
		{
			System.out.println(" invalid operation");
		}
		return 0;
		
	}
	
	public void buildMaxHeap(int n,int a[])
	{
		for(int i=n/2;i>=0;i--)
		{
			maxHeapify(n,i,a);
		}
	}
	
	public void add(int key,int a[])
	{
		siz++;
		a[siz-1]=Integer.MIN_VALUE;
		increaseKey(siz-1,key,a);	
	}
	
	public void show(int[] list)
	{
		for(int i=0;i<siz;i++)
		{
			System.out.println(list[i]);
		}
	}
	
	public static void main(String args[])
	{

		PriorityQueueUsingHeap p = new PriorityQueueUsingHeap();
		p.add(-5,p.a);
		p.add(22, p.a);
		p.add(180, p.a);
		p.add(300, p.a);
		p.show(p.a);
		System.out.println(p.poll(p.a)+ "poll ");
		System.out.println(p.poll(p.a)+ "poll ");
		System.out.println(p.poll(p.a)+ "poll ");
		
		System.out.println(p.poll(p.a)+ "poll ");
		System.out.println(p.poll(p.a)+ "poll ");
		System.out.println(p.poll(p.a)+ "poll ");System.out.println(p.poll(p.a)+ "poll ");
	}

}
