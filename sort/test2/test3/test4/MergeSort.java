package sort.test2.test3.test4;

public class MergeSort {

	
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

