import java.util.*;
import java.lang.*;

public class PrimeNumber{
	
	public static void main(String [] args ){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=scan.nextInt();
		boolean isPrime=false;
		for(int i=2;i<=num/2;i++){
			if(num%2 !=0){
				isPrime=true;
			}
		}
		
		System.out.println(isPrime);
		
	}
}