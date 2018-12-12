
public class CheckName {
	

	public int findName(String name) {
		String namesArray[]={"Dave", "Ann", "George", "Sam",
			    "Ted", "Gag", "Saj", "Agati", "Mary", 
			    "Ayan", "Dev", "Kity", "Meery",
			    "Smith", "Johnson", "Bill", "Williams", 
			    "Jones", "Brown", "Sam", "Miller",
			    "Wilson","Ayan ","Moore", "Taylor", "Anderson",
			    "Thomas", "Jackson", "George", "Sam", "Ted"};
		int count=0;
		for(int i=0;i<(namesArray.length);i++){
			if(name.equals(namesArray[i])){
				
				
				count++;
			}
		
				}
		return count;

	}
}


