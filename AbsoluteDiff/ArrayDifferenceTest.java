import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

	public class ArrayDifferenceTest {
	ArrayDifference arrayDifference;
	
	@Before
	public void setUp(){
		arrayDifference=new ArrayDifference();
	}

	@Test
	public void TestForAbsoluteDifference() {
		int[] numbers={1,2,5,4,7,8,6,2};
		int k=7;
		
		int absoluteDifference=arrayDifference.findAbsoluteDifference(numbers,k);
		assertEquals(6,absoluteDifference);
	}

}