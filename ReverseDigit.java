import java.util.*;


public class ReverseDigit{
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int inum = scan.nextInt();
		int num = inum;
		int revNum=0;
		boolean isPalindrome=false;
		 
		while(num!=0){
			int temp = num%10;
			revNum = revNum*10+temp;
			num /=10;
			
		}
		if(inum==revNum){
			isPalindrome=true;
		}
		System.out.println(isPalindrome);
		
	}
}