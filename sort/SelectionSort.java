package sort;

public class SelectionSort {

	void Sort(int[] a)
	{
		int i=0;
		int n = a.length;
		
		for(i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_idx])
				{
					j=min_idx;
				}
			}
			int temp=a[i];
			a[i]=a[min_idx];
			a[min_idx]=temp;
		}
	}
	public static void main(String[] args) {
		int [] a = {5,4,3,2,1};
		InsertionSort m = new InsertionSort();
		m.Sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
