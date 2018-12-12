

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckForPalindromeTest {
	CheckForPalindrome checkForPalindrome;
	@Before
	public void setUp(){
		checkForPalindrome=new CheckForPalindrome();
	}

	@Test
	public void TestForPalindrome() {
		String[] input={
				"POONAM",
				"ROAAOR",
				"EGG",
				"ZEBRA",
				"ANA",
				"ADA",
				"BOB",
				"EYE",
				"NIKHIL",
				"NEVEN"
		};

		String []actual=checkForPalindrome.checkIsPalindromeAndSortInDescendingOrder(input);
		String expected[]={"ROAAOR","NEVEN", "EYE", 
				"BOB", "ANA", "ADA"};
		assertArrayEquals(expected, actual);

	}
}


