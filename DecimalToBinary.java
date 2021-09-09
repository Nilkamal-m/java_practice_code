import java.util.*;

public class DecimalToBinary{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num= scan.nextInt();
		
		
		int n = num;
		String binary="";
		
		while(0<n){
			int r=n%2;
			n =n/2;
			binary=r+binary;
		}
		System.out.println(binary);  
		
	}
}