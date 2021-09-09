import java.util.*;
import java.lang.*;

public class LeapYear{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year=scan.nextInt();
		boolean isLeapYear=false;
		if(year%400==0){
			isLeapYear=true;
		}
		System.out.println(isLeapYear);
	}
}