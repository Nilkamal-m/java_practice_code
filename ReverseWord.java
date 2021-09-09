
import java.util.*;

public class ReverseWord{
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		ReverseString revs = new ReverseString();
		
		String s = scan.nextLine();
		
		//String word[] = s.split(" ");
		//String rev="";
		
		//for(int i=word.length-1;i>=0;i--){
			//rev +=word[i]+" ";
		//}
		
		//System.out.println("Reverse Word is : "+rev);
		
		String rev = revs.reverseString(s);
		
		System.out.println("Reverse Word is : "+rev);
		
	}
	
	static class ReverseString{
		public String reverseString(String s){
			String str[] = s.split("");
			String revW="";
			
			for(int i =str.length-1;i>=0;i--){
				revW+=str[i];
			}
			return revW;
			
		}
	}
	

}

	