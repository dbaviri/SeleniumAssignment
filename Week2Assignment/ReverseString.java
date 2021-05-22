package JavaProgramsAssignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String test = "feeling good";
		
		//Convert the String to character array
		
		char[] chararray = test.toCharArray();
		
		for (int i = (chararray.length-1); i >=0; i--) {
               System.out.print(chararray[i]);
		}
		
		
	}

}
