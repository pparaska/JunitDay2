import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PalindromeTest {

	@Test
	public void PalindromeTestForOddLengthNumber() {
	Palindrome palindrome=new Palindrome();
	boolean answer=(boolean) palindrome.ispalindrome(121);
	assertEquals(true,answer);
	}
	@Test
	public void PalindromeTestForEvenLengthNumber() {
	Palindrome palindrome=new Palindrome();
	boolean answer=(boolean) palindrome.ispalindrome(4224);
	assertEquals(true,answer);
	}
	@Test
	public void PalindromeTestSingleNumber() {
	Palindrome palindrome=new Palindrome();
	boolean answer=(boolean) palindrome.ispalindrome(5);
	assertEquals(true,answer);
	}
	@Test
	public void PalindromeTestForNonPalindromeNumber() {
	Palindrome palindrome=new Palindrome();
	boolean answer=(boolean) palindrome.ispalindrome(-121);
	assertEquals(false,answer);
	}
}
