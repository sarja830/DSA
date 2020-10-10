package sort.test2.test3;

public class HeapSort {

	 void maxHeapify(int i,int n ,int a[])
	{
		int l = 2*i+1;
		int r= 2*i+2;
		int largest =i;
		if(l<n && a[l]>a[largest]) largest=l;
		if(r<n && a[r]>a[largest]) largest=r;
		
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			maxHeapify(largest,n,a);
		}
		
	}
	void Sort(int[] a)
	{
		int  n = a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			maxHeapify(i,a.length,a);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			maxHeapify(0,i,a);
		}
	}
	
	public static void main(String[] args) {
		int [] a = {4,5,-3,-7,2,9};
		HeapSort m = new HeapSort();
		m.Sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}