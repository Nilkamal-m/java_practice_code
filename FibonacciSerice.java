import java.util.*;

public class FibonacciSerice{
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Serice : ");
		
		int n= scan.nextInt();
		int a=0;
		int b=1;
		int z=1;
		for(int i=0;i<n;i++){
			
			a= b; 
			b=z;
			z=a+z;
			System.out.print(a+" ");
		}
		
	}
}