public class Calculator {

	public int add(int firstNumber, int secondNumber){
		int sum = firstNumber + secondNumber;
		return sum;
	}

	public int subtraction ( int firstNumber, int secondNumber ) {
		int subtracting = firstNumber - secondNumber;
		return subtracting;
	}
	
	public int multiplication ( int firstNumber, int secondNumber ) {
		int multiply = firstNumber * secondNumber;
		return multiply;
	}

	public int division ( int firstNumber, int secondNumber ) {
		if ( secondNumber == 0 ) throw new RuntimeException ("Error!");
		int quotient = firstNumber / secondNumber;
		return quotient;
	}

}
