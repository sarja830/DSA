package basics.stack;

import java.util.Arrays;

public class Stack {
	int[] arr;
	int top;
	
	public Stack()
	{
		 arr = new int[5];
		 System.out.println("hyy");
		 push(114);
		 return;
		 //top=-1;
	}
	
	public Stack(int siz)
	{
		 arr = new int[siz];
		 top=-1;
	}
	
	int pop()
	{
		if(top==-1)
		{
			return -1;
		}
		else return  arr[top--];
	}
	
	String push(int e)
	{
		if(top==arr.length-1)
		{
			arr= Arrays.copyOf(arr, 2*arr.length);
		}
		arr[++top]=e;
		return "Success";
	}
	
	void show()
	{
		for(int i=top;i>=0;i--)
			System.out.println(arr[i]);
	}
	
	int size()
	{
		return top+1;
		
	}

}
