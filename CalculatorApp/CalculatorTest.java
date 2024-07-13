import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

	@Test //annotation
	public void testThatCalculatorCanAddTwoPositiveNumbers () {
	// default modifier--- when you don't have any of your access modifiers.


	// given
	Calculator calculator = new Calculator ();

	// when
	int result = calculator.add (2, 3);

	// assert
	assertEquals ( 5, result );

	}
	
	@Test
	public void calculatingForAddingTwoNegativeNumbers () {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.add (-2, -3 );

	//assert
	assertEquals (-5, result);

	}

	@Test
	public void calculatingForAddingTwoNumbersWhenTheFirstNumberIsAPositiveNumberAndTheSecondNumberIsANegativeNumber (){

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.add (2, -3 );

	//assert
	assertEquals (-1, result );
	}

	@Test
	public void testToCalculateTheSubtractionOfTwoPositiveNumbers () {


	//given
	Calculator calculator = new Calculator();

	//when
	int result = calculator.subtraction (7, 4);

	//assert
	assertEquals (3, result);

	}

	@Test
	public void calculatingForSubtractingTwoNegativeNumbers () {

	//given
	Calculator calculator = new Calculator();

	//when
	int result = calculator.subtraction (-7, -4 );

	//assert
	assertEquals (-3, result);

	}

	@Test
	public void calculatingForSubtractingTwoNegativeNumbersIfFirstNumberIsLesserThanSecondNumber() {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.subtraction (-4, -7 );

	//assert
	assertEquals ( 3, result );

	}

	@Test
	public void calculatingForSubtractingTwoNumbersWhenFirstNumberIsAPositiveNumberAndSecondNumberIsANegativeNumber() {
	
	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.subtraction ( 10, -7 );

	//assert
	assertEquals (17, result );
	}

	@Test
	public void calculatingForSubtractingTwoNumbersWhenFirstNumberIsANegativeNumberAndSecondNumberIsAPositiveNumber () {
	
	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.subtraction ( -10, 7 );

	//assert
	assertEquals ( -17, result );

	}

	@Test
	public void testToCalculateMultiplicationOfTwoPositiveNumbers (){
	
	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.multiplication ( 2, 3 );

	//assert
	assertEquals ( 6, result );

	}

	@Test
	public void testToCalculateMultiplicationOfTwoNegativeNumbers () {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.multiplication ( -2, -3 );

	//assert
	assertEquals ( 6, result );

	}

	@Test
	public void testToCalculateForTwoNumbersWhenOneOfTheNumbersIsANegativeNumber () {

	//given
	Calculator calculator = new Calculator ();
	
	//when
	int result = calculator.multiplication ( -2, 3 );

	//assert
	assertEquals (-6, result );

	}

	@Test
	public void testToDivideTwoPositiveNumbers () {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.division ( 6, 3);

	//assert
	assertEquals ( 2, result );

	}

	@Test
	public void testToDivideTwoNumbersWhenOneOfTheNumbersIsANegativeNumber () {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.division ( 6, -3 );

	//assert
	assertEquals ( -2, result );
	}

	@Test
	public void testToDivideTwoNumbersIftheFirstNumberIsZero () {

	//given
	Calculator calculator = new Calculator ();

	//when
	int result = calculator.division ( 0, 4 );

	//assert
	assertEquals ( 0, result );

	}

	@Test
	public void testToDivideTwoNumbersIftheSecondNumberIsZero () {

	//given
	Calculator calculator = new Calculator ();
	
	//when
	int result = calculator.division ( 4, 0 );

	//assert
	assertThrows( RuntimeExpression.class, ()-> calculator.division( 4, 0 ));
	}
}