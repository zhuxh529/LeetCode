package chap2;

import java.util.Arrays;

public class p2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(method1(arr));

	}
	
	public static int method(int[] arr){
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		
		for(int i=1;i<arr.length;i++){
			left[i]=Math.max(arr[i-1], left[i-1]);
		}
		
		for(int i=arr.length-2;i>=0;i--){
			right[i]=Math.max(arr[i+1], right[i+1]);
		}
		
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));

		int h=0, sum=0;
		for(int i=1;i<arr.length-1;i++){
			h=Math.min(left[i], right[i]);
			if(h>arr[i]){
				sum+=(h-arr[i]);
			}
			
		}
		
		return sum;
		
	}
	
	
	public static int method1(int[] arr){
		int sum=0;
		int[] a1=new int[arr.length], a2=new int[arr.length];
		int m1=0,m2=0;
		for(int i=1; i<arr.length;i++){
			a1[i]=Math.max(arr[i-1], a1[i-1]);
			a2[arr.length-1-i]=Math.max(arr[arr.length-i], a2[arr.length-i]);
		}
//		System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
		for(int i=0; i<arr.length;i++){
			sum+=(Math.min(a1[i], a2[i])-arr[i])>0?Math.min(a1[i], a2[i])-arr[i]:0;
//			System.out.println(Math.min(a1[i], a2[i])-arr[i]);
		}
		
		
		
		return sum;
	}

}
