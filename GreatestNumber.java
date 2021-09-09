import java.util.*;

public class GreatestNumber{
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int greatestNum=0;
		int i=0;
		while(i<10){
			int num = scan.nextInt();
			if(num>greatestNum){
				greatestNum=num;
			}
			i++;
		}
		System.out.println("Greatest Number is : "+greatestNum);
		
	}
}