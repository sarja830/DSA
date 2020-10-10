package basics;

public class FibonacciRecursion {

	static int fib(int n,int[] a)
	{
		if(n<=1) 
			{
				
				return a[n]=n;
			}
			
		else 
			{
			return a[n]= fib(n-1,a)+fib(n-2,a);
			
			}
	}

	public static void main(String[] args) {
		int a[] = new int[100];
		System.out.println(fib(9,a));
		for(int i=0;i<=9;i++)
			System.out.println(a[i]);
	}

}
