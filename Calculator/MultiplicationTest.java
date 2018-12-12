import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(GoodCategory.class)
public class MultiplicationTest {

	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void MultiplicationOfTwoPositiveNumbers() {
		int answer=calculator.multiplyNumbers(20,10);
		assertEquals(200,answer);
	}
	@Test
	public void MultiplicationOfTwoNegativeNumbers() {
		int answer=calculator.multiplyNumbers(-20,-10);
		assertEquals(200,answer);
	}

	@Test
	public void MultiplicationOfOnePositiveOneNegativeNumber() {
		int answer=calculator.multiplyNumbers(-20,10);
		assertEquals(-200,answer);
	}
	@Test
	public void MultiplicationOfOnePostiveOneZero() {
		int answer=calculator.multiplyNumbers(20,0);
		assertEquals(0,answer);
	}
	@Test
	public void MultiplicationOfOneNegativeOneZero() {
		int answer=calculator.multiplyNumbers(-20,0);
		assertEquals(0,answer);
	}
	@Test
	public void MultiplicationOfTwoZeros() {
		int answer=calculator.multiplyNumbers(0,0);
		assertEquals(0,answer);
	}
}
