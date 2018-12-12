import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckNumberInMultiDimensionalTest {
CheckNumberInMultiDimensional number1;

@Before
public void setUp(){

	number1=new CheckNumberInMultiDimensional();
	
}

@Test
public void findNumber(){
	boolean answer=number1.checkNumber(4);
	assertEquals(true,answer);
}
}
