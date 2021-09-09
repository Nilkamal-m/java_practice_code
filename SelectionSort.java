import java.util.*;

public class SelectionSort{
	
	public static void main(String [] args){
		int []arr={1,2,3,5,8,7,6};
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++){
			
			int min_ndx=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min_ndx]){
					min_ndx=j;
				}
			}
			
			if(min_ndx !=i){
				int temp=arr[i];
				arr[i]=arr[min_ndx];
				arr[min_ndx]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}