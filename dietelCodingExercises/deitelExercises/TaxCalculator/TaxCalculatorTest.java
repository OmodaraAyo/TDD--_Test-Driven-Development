import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {


	@Test
	public void testCalculateTax () {

	//given
	TaxCalculator taxcalculator = new TaxCalculator();

	//when
	double tax = taxcalculator.calculateTax (30_000);

	//assert
	assertEquals (4_500, tax)

}
}