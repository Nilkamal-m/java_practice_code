
import java.util.*;

public class BubbleSort
{
	public static void main(String[] args) {
		int [] arr ={1,2,8,3,4};
		
		for(int i=0;i<arr.length-1;i++){
		    boolean flag =false;
		    for(int j=0;j<arr.length-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            flag =true;
		        }
		    }
		    if(flag==false){
		        break;
		    }
		
		}
		System.out.println(Arrays.toString(arr));
	}
}
