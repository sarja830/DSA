package sort;

public class MergeSort {

	public void Sort( int l ,int  r ,int[] a) {
		if(r>l)
		{
			int mid = (l+r)/2;
			Sort(l,mid,a);
			Sort(mid+1,r,a);
			merge(l,mid,r,a);
		}
		return;
	}
		void merge(int l,int mid,int r ,int[]ar )
		{
			int n1=mid+1-l;
			int n2= r-mid;
			
			int a[] = new int[n1];
			int b[] = new int[n2];
			for(int i=0;i<n1;i++)
			{
				a[i]=ar[i+l];
			}
			for(int i=0;i<n2;i++)
			{
				b[i]=ar[i+mid+1];
			}
			int k = l;
			int i=0;
			int j= 0;
			while(i<n1 && j<n2)
			{
				if(a[i]>b[j])
				{
					ar[k++]=b[j++];
				}
				else
				{
					ar[k++]=a[i++];
				}
				
			}	
			while(i<n1)
			{
				ar[k++]=a[i++];
			}
			while(j<n2)
			{
				ar[k++]=a[j++];
			}
		}
			
	
	public static void main(String[] args) {
		int [] a = {5,4,3,2,1};
		MergeSort m = new MergeSort();
		m.Sort(0,(a.length)-1, a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

