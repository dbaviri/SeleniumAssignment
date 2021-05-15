package week1.day1.Assignments;

import java.util.Scanner;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n , temp; 
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the number of Elements you want in the array: ");
       n = s.nextInt();
       int a[] = new int[n];
       System.out.println("Enter all the Elements:");
       
       for(int i = 0;i < n ;i++)
       {
    	   a[i] = s.nextInt();    	    			   
    	   
       }
	
       for( int i = 0 ; i < n; i ++)
       {
    	   for(int j = i+1; j < n ; j++)
    	   {
    		   
    		  if(a[i] > a[j])
              {
	              temp = a[i];
	              a[i] = a[j];
	              a[j] = temp;	          
              }
     	   }   	  
    	
       }
         System.out.println("Ascending Order");
    	 for(int k = 0; k < a.length-1; k++)
    	 {	 
    	 System.out.print(a[k]+",");	 
    	    	 
    	 }
    	 System.out.print(a[n-1]);
    	    	   
       System.out.println("SORTED");
		
      int m = 1 ;
       while (m < a.length ) 
       {
           if ( a[m] - a[m-1] == 1 ) 
           {
           } 
           else 
           {
               System.out.println( "Missing number is " + ( a[m-1] + 1 ) );
           }
           m++;
       }
     }
       
	  
	}



