package main;

import java.util.*;

public class BinaryStringOfN {

	public static void main(String[] args) {
		System.out.println("ENter the no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BinaryStringOfN b= new BinaryStringOfN();
		
		b.binaryString(n,"");
	}
	
	public void binaryString(int n,String ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		binaryString(n-1,ans+"0");
		binaryString(n-1,ans+"1");
		return;
	}

}
