package week1.day1.Assignments;

import java.util.HashSet;

public class MissingElemenytsDuplicatesHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 3, 1, 5, 5 };

	    int Largest = numbers[0];
	    for (int i = 0; i < numbers.length; i++) {
	        if (numbers[i] > Largest) {
	            Largest = numbers[i];
	        }
	    }
	    System.out.println("Largest no in given array -->" + Largest);

	    HashSet<Integer> set = new HashSet<Integer>();

	    int arr[] = new int[Largest+1];

	     for (int i = 1; i < arr.length; i++) {
	     set.add(i);
	     }

	    for (int j = 0; j < numbers.length; j++) {
	        set.remove(numbers[j]);
	    }

	    System.out.println("Missing  no are :");
	    for (int x : set) {
	        System.out.print(x + " ");
	    }

			
	}

}
