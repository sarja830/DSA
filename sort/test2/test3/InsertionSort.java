package sort.test2.test3;

public class InsertionSort {

	void Sort(int a[])
	{
		int n = a.length;
		for(int i=1;i<n;i++)
		{
			int temp =a[i];

			int j=i-1;
			while(j>=0)
			{
				if(a[j]>temp)
					a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
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
