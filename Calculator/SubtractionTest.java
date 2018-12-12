import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class SubtractionTest {

		private Calculator calculator;
		@Before
		public void setup()
		{
			calculator = new Calculator();
		}

		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfTwoPositiveNumbers() {
			int answer=calculator.subtractNumbers(100,50);
			assertEquals(50,answer);
		}
		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfTwoNegativeNumbers() {
			int answer=calculator.subtractNumbers(-100,-50);
			assertEquals(-50,answer);
		}

		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfOnePositiveOneNegativeNumber() {
			int answer=calculator.subtractNumbers(-100,50);
			assertEquals(-150,answer);
		}
		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfOnePostiveOneZero() {
			int answer=calculator.subtractNumbers(50,0);
			assertEquals(50,answer);
		}
		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfOneNegativeOneZero() {
			int answer=calculator.subtractNumbers(-50,0);
			assertEquals(-50,answer);
		}
		@Test
		@Category(GoodCategory.class)
		public void SubtractionOfTwoZeros() {
			int answer=calculator.subtractNumbers(0,0);
			assertEquals(0,answer);
		}
	}
