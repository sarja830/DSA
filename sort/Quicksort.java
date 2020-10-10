package sort;

public class Quicksort {

	int partition(int a[],int low ,int high)
	{
		int i =low-1;
		int j=low;
		int pivot=a[high];
		for( j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	public void Sort(int a[],int low ,int high)
	{
		if(low<high)
		{
			int piv = partition(a,low,high);
			Sort(a,low,piv-1);
			Sort(a,piv+1,high);
			}
	}
	public static void main(String[] args) {
		int [] a = {5,4,3,2,1};
		Quicksort m = new Quicksort();
		m.Sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
