package week1.day1.Assignments;

public class Mobile {

	String mobileModel = "Samsung";
	int mobileWeight = 500 ;
	boolean  isFullCharge = true;
	double mobileCost = 25000;
	public void makeCall() {
		
		System.out.println("Call Connected");
	}
	
	
	public void sendMsg() {
		
		System.out.println("Message Sent");
		
	}
	
	
	public static void main(String[] args)
		{
	Mobile obj = new Mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println(obj.mobileModel);
	System.out.println(obj.mobileWeight);
	System.out.println(obj.isFullCharge);
	System.out.println(obj.mobileCost);
	
}
}

