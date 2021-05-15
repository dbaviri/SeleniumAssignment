package week1.day1.Assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]={9,6,4,5,7,0,1};
        Arrays.sort(numbers);
        int numbersArrayIndex = 0;
        for (int i = 0; i < numbers[numbers.length - 1]; i++) {
            if (i == numbers[numbersArrayIndex]) {
                numbersArrayIndex++;
            }
            else {
                System.out.println(i);
            }
        }
	}
}		
		



