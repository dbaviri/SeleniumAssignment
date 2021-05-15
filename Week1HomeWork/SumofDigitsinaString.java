package week1.day1.Assignments;

public class SumofDigitsinaString {

	static int findSum(String str)
		{
			// A temporary string
			

			// holds sum of all numbers present in the string
			int sum = 0;

			// read each character in input string
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				// if current character is a digit
				if (Character.isDigit(ch))
					{
					System.out.print(ch);
					sum  += ch;
					}
				// if current character is an alphabet
				else {
					// increment sum by number found earlier
					// (if any)
					System.out.print(ch);
					sum += Character.getNumericValue(ch);
                    
					// reset temporary string to empty
					
			  }
			}
			System.out.println();
			return sum ;
			
		}

		// Driver code
		public static void main(String[] args)
		{

			// input alphanumeric string                                                                     
			String str = "12abc20yz9iii68";

			// Function call
			System.out.println(findSum(str));
		}
	}

	// This code is contributed by AnkitRai01

	
	
	
	
	
		
		
		
		
		
	                                                                                                                                                                           