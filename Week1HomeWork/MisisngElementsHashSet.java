package week1.day1.Assignments;

import java.util.Arrays;
import java.util.HashSet;

public class MisisngElementsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {9, 6, 4, 5, 7, 0, 1};
	    Arrays.sort(numbers);
	    HashSet<Integer> set = new HashSet<Integer>();

	    for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
	        set.add(i);
	    }

	    for (int i = 0; i < numbers.length; i++) {
	        set.remove(numbers[i]);
	    }

	    for (int x : set) {
	        System.out.print(x + " ");
	    }
	
		
	}

}
