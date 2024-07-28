import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaxCalculator2 {

	@Test
	public void testToCalculateTax() {

	//given
	TaxCalculator calculator = new TaxCalculator();

	//when
	double earnings = calculator.AnnualTaxCalculator(30_000);

	//assert
	assertEquals (4_500, earnings );
}
}