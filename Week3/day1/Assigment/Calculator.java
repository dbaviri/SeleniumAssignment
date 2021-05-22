package Week3.Day3.Assignment;

public class Calculator {

	public int calcAdd(int arg1,int arg2 ) {
		
		int sum = arg1+arg2;
		return sum; 
	}
	
	public int calcAdd(int arg1,int arg2, int arg3 ) {
		
		int sum = arg1+arg2+arg3;
		return sum;
	}
	
	public int  calcMult(int arg1, int arg2, int arg3)
	{
		int mult = arg1*arg2*arg3;
		return mult;
		
	}
	
	
	public double calcMult(int arg1, int arg2) {
		 double mult = arg1 * arg2;
		 return mult;
		
	}
	
	
	public int calcsubtract(int arg1, int arg2) {
		int sub = arg1 - arg2;
		return sub;
		
	}
	
	public double calcsubtract(double arg1, double arg2) {
		double sub  = arg1 - arg2;
		return sub;
		
	}
	
	
	public float calcdivide(int arg1, int arg2) {
		float div = arg1/arg2;
		return div;
	}
	
	public double calcdivide(double arg1, int arg2) {
		double div = arg1/arg2;
		return div ; 
		
		
	}
	
	
	
}
