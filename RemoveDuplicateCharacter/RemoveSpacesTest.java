
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveSpacesTest {

	RemoveSpaces removeSpaces;

	@Before
	public void setUp(){
		removeSpaces=new RemoveSpaces();
	}


	@Test
	public void TestToRemoveExtraBlankSpacesAndDeleteTheWord() {

		String input="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String wordToDelete="IS";
		int wordPosition=6;
		String output=removeSpaces.removeExtraSpaces(input,wordToDelete,wordPosition);
		System.out.println(output);
		String expectedOutput="A MORNING WALK IS A BLESSING FOR THE WHOLE DAY ";


		assertEquals(expectedOutput,  output);
	}

	@Test
	public void Test1ToRemoveExtraBlankSpacesAndDeleteTheWord() {

		String input="AS YOU    SOW, SO   SO YOU REAP";
		String wordToDelete="SO";
		int wordPosition=4;
		String output=removeSpaces.removeExtraSpaces(input,wordToDelete,wordPosition);
		System.out.println(output);
		String expectedOutput="AS YOU SOW, SO YOU REAP ";
		assertEquals(expectedOutput,  output);

	}


}