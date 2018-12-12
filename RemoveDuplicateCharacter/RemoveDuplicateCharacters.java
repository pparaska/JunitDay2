

public class RemoveDuplicateCharacters {
	public String removeDuplicates(String input){
		String string = new String();
	    for (int i= 0; i<input.length(); i++) {
	        if(!string.contains(String.valueOf(input.charAt(i)))) { 
	        	string+= String.valueOf(input.charAt(i));  
	        }
	    }
	    return string;
	}

}