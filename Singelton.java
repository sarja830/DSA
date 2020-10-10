package basics;



 class singeltonDemo
{
	 static singeltonDemo a = null;
	 
	private singeltonDemo()
	{
		System.out.print("hello");
	}
	static singeltonDemo getInstance()
	{
		System.out.print("hello");
		if(a==null)
			a= new singeltonDemo();
		
		return a;
	}
	
}

public class Singelton {

	public Singelton() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[])
	{
		singeltonDemo s1 = singeltonDemo.getInstance();
		singeltonDemo s2 = singeltonDemo.getInstance();
	}
	

}
