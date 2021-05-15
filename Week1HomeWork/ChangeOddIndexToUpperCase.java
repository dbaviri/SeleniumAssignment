package week1.day1.Assignments;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Changeme";
		
		
		char[] chars= test.toCharArray();
		
		for(int i = 0; i <chars.length;i++)
		{
			
			
			if(i%2 != 0 ) {
				
				System.out.print(Character.toUpperCase(chars[i]));
			}
			else {
				System.out.print(Character.toLowerCase(chars[i]));
			}
				
			
		}
	

		
		
		
	}

}
