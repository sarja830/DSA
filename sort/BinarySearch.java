package sort;

public class BinarySearch {

	 static int  bsl(int key, int a[],int low ,int high,int res) {
		if(high>=low)
		{
			int mid= (low+high)/2;
			 if(a[mid]==key) 
				 {
				 	res=mid;	
				 	return bsl(key,a,low , mid-1,res);
				 }
			 else if(a[mid]>key) return bsl(key,a,low , mid-1,res);
			 else return bsl(key,a,mid+1,high,res);
		}
		return res;
		
	}
	 static int  bsr(int key, int a[],int low ,int high,int res) {
			if(high>=low)
			{
				int mid= (low+high)/2;
				 if(a[mid]==key) 
					 {
					 	res=mid;	
					 	return bsr(key,a,mid+1,high,res);
					 }
				 else if(a[mid]>key) return bsr(key,a,low , mid-1,res);
				 else return bsr(key,a,mid+1,high,res);
			}
			return res;
			
		}
	public static void main(String args[])
	{
		int a[]= new int[]{1,1,3,3,3,4,5,6};
		System.out.println(bsl(3,a,0,a.length-1,-1));
		System.out.println(bsr(99,a,0,a.length-1,-1));
	}

}
