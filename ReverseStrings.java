package main;


import java.util.*;


public class Strings {
	
	static public void reverse(char[] c,int l , int r)
	{
		if(l<r)
		{
			char temp= c[l];
			c[l]=c[r];
			c[r]=temp;
			 reverse(c,l+1,r-1);
		}
		return;
	}
	
	public static void main(String[] args) {
		String s = "Sarthak";
		char[] t=s.toCharArray();
		reverse(t,0,s.length()-1);
		 s = new String(t);
		System.out.println(s);
	}

}
