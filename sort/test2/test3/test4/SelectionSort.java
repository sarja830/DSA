package sort.test2.test3.test4;

public class SelectionSort {
	

	
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
