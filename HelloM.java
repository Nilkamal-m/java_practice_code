import java.util.*;
import java.lang.*;

public class HelloM
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 2 Dice Sum ") ;
        int n = scan.nextInt();
        int index=0;
		if(n>=2 && n<=12){  
			for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i+j==n){
                    index++;
                }
            }
        }
		}
        
	
	System.out.println(index);
	
	
    
	}
}