package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
	    int Size = 150 ; 
		System.out.println("The desktop Size is : "+ Size);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Desktop desk1 = new Desktop();
          desk1.computerModel();
          desk1.desktopSize();
	}

}
