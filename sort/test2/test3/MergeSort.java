package sort.test2.test3;

public class MergeSort {

	void merge(int arr[],int low ,int mid , int high) {
		int m = mid+1-low;
		int n = high-mid;
		int a[] = new int[m];
		int b[]= new int[n];
		for(int i=0;i<m;i++)
		{
			a[i]= arr[low+i];
		}
		for(int i=0;i<n;i++)
		{
			b[i]= arr[mid+1+i];
		}
		int i=0,j=0,k=low;
		while(i<m && j<n)
		{
			if(a[i]>b[j])
				arr[k++]=b[j++];
			else
				arr[k++]=a[i++];
		}
		
			while(j<n)
				arr[k++]=b[j++];
	
			while(i<m)
				arr[k++]= a[i++];
		
		
	}
	void Sort(int[] a ,int low,int high)
	{
		if(high>low)
		{
			int mid= (low+high)/2;
			Sort(a,low,mid);
			Sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void main(String[] args) {
		int [] a = {5,4,3,2,1};
		MergeSort m = new MergeSort();
		m.Sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

