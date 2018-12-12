import java.util.Arrays;
import java.util.Collections;

public class CheckForPalindrome {

	public String[] checkIsPalindromeAndSortInDescendingOrder(String[] input) {
		String[] inputs = new String[6];
		int inputscounter = 0;
		for (String word : input) {
			if (isPalindrome(word)) {
				inputs[inputscounter] = word;
				inputscounter++;
			}
		}
		Arrays.sort(inputs,Collections.reverseOrder());
		return inputs;
	}

	public boolean isPalindrome(String word) {
				
		StringBuilder stringbuilder = new StringBuilder();
		for (int counter = word.length() - 1; counter >= 0; counter--) {
			stringbuilder.append(word.charAt(counter));
		}
		
		return word.equals(stringbuilder.toString());
	}

}