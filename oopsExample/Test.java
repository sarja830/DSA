package oopsExample;
 interface CommuncationDevice {

	default void connect()
	{
		System.out.print("connecting");
	}
	void talk();
	void message();
	void videoCall();
}


 class Mobile implements CommuncationDevice {
	private int sim=0;
	private String model;
	private String name;
	
	
	public Mobile() {
		this.sim=1;
		this.name="Apple";
		this.model="Iphone 10";
	}
	public Mobile(String name,String model,int sim) {
		this.sim=sim;
		this.name=name;
		this.model=model;
	}
	
	int getSim()
	{
		return sim;
	}
	
	void setSim(int sim)
	{
		this.sim=sim;
	}
	
	@Override
	public void talk() {
		System.out.println("talking through phone "+name);

	}
	

	@Override
	public void message() {
		System.out.println("messaging through phone "+name);

	}
	
	public void message(String s) {
		System.out.println("messaging" +s+" through phone "+name);

	}

	@Override
	public void videoCall() {
		System.out.println("videocalling  through phone "+name);

	}

}


public class Test {

	public static void main(String args[])
	{
		//CommuncationDevice nokia = new Mobile("N0kia","s3",2);
		Mobile nokia = new Mobile("Nokia","s3",2); 
		nokia.talk();
		nokia.message();
		//nokia.message("hello method overloading" );
		nokia.videoCall();
		
		nokia.setSim(3);
		nokia.getSim();
		
		CommuncationDevice nokiaUser  = new Mobile("N0kia","s3",2);
		nokiaUser.talk();
		nokiaUser.message();
		nokiaUser.videoCall();
		
	}

}
