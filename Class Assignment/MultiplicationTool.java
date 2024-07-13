public class MultiplicationTool {


	public int addingnumberstogetmultiplication (int number, int number2 ) {
		int sum = 0;
		if (number > number2){
			for (int counter = 1; counter <= number2; counter++ ){
			sum = sum + number;
			}
		}
		else if (number2 > number){
			for(int counter = 1; counter <= number; counter++){
				sum = sum + number2;
			}
		}return sum;
        }
	
	public int multiplingTwoNegativeNumbers (int number, int number2){
		int sum = 0;
		if (number < 0 && number2 < 0 && number2 > number){
			number = number / -1;
			number2 = number2 / -1;
			for (int counter = 1; counter <= number2; counter++){
			sum = sum + number;
			}
		}return sum;
	}

	public int multiplingOneNegativeNumberWithAPositiveNumber (int firstNumber, int secondNumber){	
		int sum = 0;
		if (firstNumber > 0 && secondNumber < 0 && firstNumber > secondNumber){
			secondNumber = secondNumber / -1;
			for (int counter = 1; counter <= secondNumber; counter++){
				sum += firstNumber;
			}	
		}return -(sum);
	}

}