package Week3.Day3.Assignment;

public class MyCalculator {

		public static void main(String args[])
		{
			Calculator calc = new Calculator();
			
			System.out.println(calc.calcAdd(4,5));
			System.out.println(calc.calcAdd(4,5,7));
			System.out.println(calc.calcdivide(9, 3));
			System.out.println(calc.calcdivide(9.3,3));
			System.out.println(calc.calcsubtract(4.2, 2.1));
			System.out.println(calc.calcsubtract(10, 5));
			System.out.println(calc.calcMult(6, 8));
			System.out.println(calc.calcMult(7, 4, 6));
		}
	}


