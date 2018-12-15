public class RemoveSpaces {


	public String removeExtraSpaces(String input, String wordToDelete, int wordPosition) {

		StringBuffer sb=new StringBuffer();
		String[] splittedString=input.split("\\s+");

		for(int i=0;i<splittedString.length;i++){
			if(!((i+1)==wordPosition && wordToDelete.equals(splittedString[i]))){
				sb.append(splittedString[i]+" ");
			}
		}


		return sb.toString();
	}

}