package sort.test2.test3;

public class SelectionSort {
	
	void Sort(int a[])
	{int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			
			int min_idx = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[min_idx]>a[j])
				min_idx=j;
			}
			int temp=a[min_idx];
			  a[min_idx]=a[i];
			a[i]=temp;
			
		}
	}
	
	public static void main(String[] args) {
		int [] a = {5,4,3,2,1};
		SelectionSort m = new SelectionSort();
		m.Sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
