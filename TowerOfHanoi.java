package basics;

public class TowerOfHanoi {

	static public void shift(int n,String source,String dest,String aux)
	{
		if(n==1)
		{
			System.out.println("Move disk "+n+" from "+source +"to "+dest);
			return;
		}
		
		shift(n-1,source,aux,dest);
		System.out.println(" Move disk "+n+" from "+source +" to "+dest);
		shift(n-1,aux,dest,source);
	}
	
	public static void main(String[] args) {
		shift(3,"A","C","B");

	}

}
