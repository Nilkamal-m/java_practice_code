import java.util.*;
import java.lang.*;

public class FindHCF{
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int num1= scan.nextInt();
		System.out.print("Enter the 2nd number : ");
		int num2= scan.nextInt();
		int hcf=1;
		for(int i=1;i<=num2;i++){
			if((num1%i==0)&&(num2%i==0)){
				hcf=i;
			}
		}
		System.out.println("HCF of two number is : "+hcf);
	}
}