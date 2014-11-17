package chap2;

import java.util.Arrays;

public class p2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,11,2,22,2,2,};
//		System.out.println(method1(arr, 2));
		System.out.println(method2(arr, 2));
//		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));

		
	}
	
	public static int method1(int[] arr, int tar){
		
		int idx=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]!=tar){
				arr[idx++]=arr[i];
			}
		}
		
		return idx;
		
	}
	
	public static int method2(int[] arr, int tar){
		int idx=0;
		for(int e:arr){
			if(e!=tar) arr[idx++]=e;
		}
		return idx;
	}

}
