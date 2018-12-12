/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *	Example 1:
 *	Input: "Let's take LeetCode contest"
 *	Output: "s'teL ekat edoCteeL tsetnoc"
 *
 */

package BasicJavaPart2;

public class ReverseString {


	public static void main(String[] args) {
		String string1="Let's take LeetCode contest";

		for(String string2:string1.split(" ")){
			for(int i=string2.length()-1;i>=0;i--){
				System.out.print(string2.charAt(i));
			}
			System.out.print(" ");
		}
	}

}