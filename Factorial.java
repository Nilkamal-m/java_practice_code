import java.util.*;

public class Factorial{
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= scan.nextInt();
		int factorial=1;
		if(n>1){
			for(int i =2;i<=n;i++){
			factorial *=i;
		}
		}
		System.out.println(factorial);
		
	}
}