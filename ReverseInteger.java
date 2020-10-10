package basics;

public class ReverseInteger {

	static public int reverse(int x) {
		int rem=0;
		while(x>0)
		{
			rem=rem*10+ x%10;
			x=x/10;
		}
		return rem;
	}

	public static void main(String[] args) {
		int x = 541;
		StringBuffer sb = new StringBuffer(Integer.toString(x));
		String s =sb.reverse().toString();
		 x=Integer.parseInt(s);
		 System.out.println(x);
		x=reverse(x);
		System.out.println(x);
	}

}
