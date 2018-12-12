import static org.junit.Assert.*;

import org.junit.Test;


public class CheckNumberInMultiDimensional {

	
	public boolean checkNumber(int number) {
		int elements[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0; row<elements.length; row++){
			for(int column=0; column<elements[row].length;column++ ){
				if(number==elements[row][column])
					return true;
			}
		}
		return false;
	}

}
