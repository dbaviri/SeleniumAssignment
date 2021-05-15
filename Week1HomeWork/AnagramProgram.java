package week1.day1.Assignments;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length() == text2.length()) {
			
			System.out.println("Strings length is same for text1 and text2");
			
		}
		
		char[] TEXT1 = text1.toLowerCase().toCharArray();
		
		char[] TEXT2 = text2.toLowerCase().toCharArray();
		
		Arrays.sort(TEXT1);
		Arrays.sort(TEXT2);
		
		boolean flag = Arrays.equals(TEXT1, TEXT1); 
		
		if(flag) {
			System.out.println(TEXT1 + " and "+ TEXT2 +" are anagrams");
			
		}else {
			System.out.println(TEXT1 + " and "+ TEXT2 + " are NOT anagrams");
		}
		
	}

}
