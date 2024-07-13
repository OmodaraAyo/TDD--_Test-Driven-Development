import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsingAdditionToGeTResultOfMultplicationInsteadOfMultiplicationSymbolTest {


	@Test 
	public void testCanCalculateMultiplicationOfTwoPositiveNumbers(){

	//given
	MultiplicationTool calculator = new MultiplicationTool();

	//When
	int result = calculator.addingnumberstogetmultiplication ( 5, 2 );
	int secondResult = calculator.addingnumberstogetmultiplication (2, 5);
	//assert
	assertEquals(10, result, secondResult);
	
	}

	@Test
	public void testToMultiplyTwoNumbersWhenOneOfTheNumbersIsnegative(){
	
	//given
	MultiplicationTool calculator = new MultiplicationTool();

	//when
	int result = calculator.multiplingOneNegativeNumberWithAPositiveNumber(5, -2);

	//assert
	assertEquals (-10, result);

	}

	@Test
	public void testingToMultiplyTwoNegativeNumbers(){

	//given
	MultiplicationTool calculator = new MultiplicationTool();

	//when
	int result = calculator.multiplingTwoNegativeNumbers (-4, -2);

	//assert
	assertEquals (8, result);

	}
}