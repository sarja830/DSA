package sort.test2.test3.test4;

public class HeapSort {

	static void maxHeapify(int[] a,int n,int i)
	 {
		 int largest= a[i];
		 int left=2*i+1;
		 int right=2*i+2;
		 
		 if( left<n && a[left]>a[largest]) largest= left;
		 if( right<n && a[right]>a[largest]) largest= right;
		 
		 if(largest!=a[i])
		 {
			 int temp= a[i];
			 a[i]=a[largest];
			 a[largest] = temp;
			 maxHeapify(a,n,largest);
		 }
		 
	 }
	 
	 void Sort(int a[])
	 {
		 int n = a.length;
		 for(int i=n/2;i>=0;i--)
		 {
			 maxHeapify(a,n,i);
		 }
		 for(int i=n-1;i>=0;i--)
		 {
			 int temp= a[i];
			 a[i]=a[0];
			 a[0]= temp;
			 maxHeapify(a,i,0);
			 
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