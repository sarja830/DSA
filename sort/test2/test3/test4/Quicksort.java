package sort.test2.test3.test4;

public class Quicksort {

	
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
