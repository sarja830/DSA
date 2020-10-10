package sort;

public class BubbleSort {

	void Sort(int[] a)
	{
		int i=0;
		int n = a.length;
		
		for(i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{	if(a[j]>a[j+1])
				{ int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				}
			}	
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

