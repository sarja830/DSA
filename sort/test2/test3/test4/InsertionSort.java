package sort.test2.test3.test4;

public class InsertionSort {

	void Sort(int[] a )
	{
		int j=0;
		int n = a.length;
		for(int i=1;i<n;i++)
		{
			int key = a[i];
			j=i-1;
			while(j>=0)
			{
				if(a[j]>key)
					a[j+1]=a[j];
				j--;	
			}
			a[j+1]=key;
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
