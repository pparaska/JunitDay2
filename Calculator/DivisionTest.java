import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class DivisionTest {


	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void DivisionOfTwoPositiveNumbers() {
		int answer=calculator.divideNumbers(20,10);
		assertEquals(2,answer);
	}
	@Test
	public void DivisionOfTwoNegativeNumbers() {
		int answer=calculator.divideNumbers(-20,-10);
		assertEquals(2,answer);
	}

	@Test
	public void DivisionOfOnePositiveOneNegativeNumber() {
		int answer=calculator.divideNumbers(-20,10);
		assertEquals(-2,answer);
	}
	@Test
	public void DivisionOfOnePostiveOneZero() {
		int answer=calculator.divideNumbers(0,20);
		assertEquals(0,answer);
	}
	@Test
	public void DivisionOfOneNegativeOneZero() {
		int answer=calculator.divideNumbers(0,-20);
		assertEquals(0,answer);
	}
	
}

