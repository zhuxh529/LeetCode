package chap2;

import java.util.Arrays;

public class p2_2 {
	public static void main(String[] args) {
		int[] arr={1,1,1,1,2,3,3,3,5,5,5,5,5,6};
		int len=method1(arr);
		System.out.println(len);
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static int method1(int[] arr){
		
		int index=1;
		
		for(int i=1;i<arr.length;i++){
			if(arr[index-1]!=arr[i]){
				arr[++index]=arr[i];
			}
			
		}
		
		return index+1;
		
	}
	
	public static int method2(int[] arr){
		int idx=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[idx-1]){
				arr[++idx]=arr[i];
			}
		}
		return idx+1;
		
	}


}
