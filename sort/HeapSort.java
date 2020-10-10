package sort;

public class HeapSort {

	public void Sort(int[] a) {
		int n = a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(i,a,n);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp= a[i];
			a[i]= a[0];
			a[0]=temp;
			heapify(0,a,i);
		}
		
	}
	void heapify(int i ,int[] a,int n )
	{
		int largest = i ;
		int l = 2*i+1;
		int r = 2*i + 2;
		
		if(l<n && a[l]>a[largest])
			largest=l;
		
		if(r<n && a[largest]<a[r])
			largest=r;
		
		if(largest!=i)
		{
			int temp= a[i];
			a[i]= a[largest];
			a[largest]=temp;
			
			heapify(largest,a,n);
		}
		
	}

	public static void main(String[] args) {
		int [] a = {4,5,3,7,2,9};
		HeapSort m = new HeapSort();
		m.Sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}