package chap2;

import java.util.Arrays;

public class p2_1 {
	public static void main(String[] args) {
		int[] arr={1,2,3,3,3,5,5,6};
		int len=method3(arr);
		System.out.println(len);
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static int method1(int[] arr){
		
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[index]!=arr[i]){
				arr[++index]=arr[i];
			}
			
		}
		
		return index+1;
		
	}

	public static int method2(int[] arr){
		int idx=0;
		for(int i=1;i<arr.length;i++){
			if(arr[idx]!=arr[i]){
				arr[++idx]=arr[i];
			}
		}
		return idx+1;
	}
	
	
	public static int method3(int[] arr){
		int idx=0;//idx keeps the largest number seen by i
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[idx]){
				arr[++idx]=arr[i];
			}
		}
		return idx+1;
	}
}
