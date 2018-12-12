
public class ArrayDifference {

	public int findAbsoluteDifference(int[] numbers, int k) {

		for(int i=0;i<numbers.length;i++){

			for(int j=i;j<numbers.length;j++){

				if(i!=j){
					if(numbers[i]==numbers[j]){
						int difference=Math.abs(i-j);

						return difference;
					}
				}
			}
		}
		return -1;
	}
}
