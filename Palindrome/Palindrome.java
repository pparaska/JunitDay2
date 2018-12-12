
public class Palindrome {

	public Object ispalindrome(int i) {
		
int result=0;
		
		int number2=i;
		int remainder=0;
		while(number2>0){
			remainder=number2%10;
			number2=number2/10;
			result=result*10+remainder;
			
		}
		
		if(result==i){
			return true;
		}else{
			return false;
		}

	}

}
