package Week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {4,0,3,0,1,5,2,0};
		int count = 0 ; 
			
		for (int i = 0; i <(numArray.length-2); i++) {
			//check if first number is zero, if zero -> shift right and swap the right number to left
			if(numArray[i]==0)
			{
				
				if(numArray[i+1]==0)
				{
					
					numArray[i]=numArray[i+2];
					numArray[i+2]=0;
					
				}
				else {
					numArray[i]= numArray[i+1];
					numArray[i+1]=0;
				}
			}
			
			else {
				continue;
			}
		}
		
		
		List<Integer> values = new ArrayList<Integer>();

		for (Integer integer : numArray) {
			if(integer!=0)
				{
				values.add(integer);
				 count++;
				}
			}
	
	
		for(int i=0;i<(numArray.length-count);i++)
		{
		values.add(0);
		}
		System.out.println(count);
		System.out.println(values);
		
		
		/*
		 * for (Integer integer : numArray) {
		 * 
		 * System.out.print(integer); }
		 */
	
	}}