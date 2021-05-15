package week1.day1.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String Str1 = "MADAM", rev = "";
	
	int strlength = Str1.length();
	
	for(int i = Str1.length()-1; i >= 0 ; i --)
	{
		
	  rev = rev + Str1.charAt(i);
		
	}
			
	if( Str1.toLowerCase().equals(rev.toLowerCase())) {
		
		System.out.println(Str1+" is a Palindrome");
				
	}
	else {
		System.out.println(Str1+ " is not a Palidrome");
	}
		

	}

}
