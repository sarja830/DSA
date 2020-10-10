package basics;

public class FibonacciRegular {

	public static void main(String[] args) {
		int n =9;
		int a=0,b=1,c=0;
		if(n<=1) System.out.println(n);
		
		else
		{System.out.print(0+" ");
		System.out.print(1+" ");
			for(int i=2;i<=n;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}System.out.println(" ");
			System.out.println(c);
		}
		

	}

}
