import java.util.*;
import java.lang.*;

public class ReverseNumber{
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		int reverse=0;
		
		while(num !=0){
			int temp=num%10;
			reverse = reverse*10 + temp;
			num=num/10;
		}
		
		System.out.println(reverse);
		
	}
}