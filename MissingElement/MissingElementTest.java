import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
	public class MissingElementTest {

	private int[] output;
	private int[] input;
	private FindMissingElement findMissingElement;


	
	public MissingElementTest(int[] input,int[] output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Object data(){
	
		return Arrays.asList(new int[][][]{
				{{0,1,4,3,5},{2}},
				{{0,5,4,3,2,1,7},{6}},
				{{0,1,5,3,2},{4}},
				
		});
	}

	@Before
	public void setUp(){
		findMissingElement=new FindMissingElement();
	}
	
	@Test
	public void TestForMissingElement() {
		assertEquals((int)output[0], findMissingElement.getMissingElement(input));
	}
	
}







