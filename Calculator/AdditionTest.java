import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


	public class AdditionTest {
	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void AdditionOfTwoPositiveNumbers() {
		int answer=calculator.addNumbers(50,50);
		assertEquals(100,answer);
	}
	@Test
	public void AdditionOfTwoNegativeNumbers() {
		int answer=calculator.addNumbers(-50,-50);
		assertEquals(-100,answer);
	}

	@Test
	public void AdditionOfOnePositiveOneNegativeNumber() {
		int answer=calculator.addNumbers(-50,50);
		assertEquals(0,answer);
	}
	@Test
	public void AdditionOfOnePostiveOneZero() {
		int answer=calculator.addNumbers(50,0);
		assertEquals(50,answer);
	}
	@Test
	public void AdditionOfOneNegativeOneZero() {
		int answer=calculator.addNumbers(-50,0);
		assertEquals(-50,answer);
	}
	@Test
	public void AdditionOfTwoZeros() {
		int answer=calculator.addNumbers(0,0);
		assertEquals(0,answer);
	}
}
