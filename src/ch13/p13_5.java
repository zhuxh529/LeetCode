package ch13;

import java.util.Arrays;

public class p13_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,1,4,5,8,5,10};
		stock(arr);
	}
	
	public static void stock(int[] arr){
		int[] f=new int[arr.length];
		int[] g=new int[arr.length];
		int  min, minIdx;
		
		f[0]=0;
		minIdx=0;
		min=arr[0];
		int diff=0;
		for(int i=1; i< arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
				minIdx=i;
			}
			if(arr[i]-min>diff){
				diff=arr[i]-min;
			}
			f[i]=Math.max(f[i-1], arr[i]-min);
			
			
		}
		diff=0;
		for(int i=arr.length-2, max=arr[arr.length-1], maxIdx=arr.length-1;i>=0; i--){
			if(arr[i]>max){
				max=arr[i];
				maxIdx=i;
			}
			if(max-arr[i]>diff){
				diff=max-arr[i];
			}
			g[i]=Math.max(g[i+1], max-arr[i]);
			
		}
		
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(g));
		int max=0, maxIdx=0;
		for(int i=0; i<arr.length;i++){
			if(g[i]+f[i]>max){
				maxIdx=i;
			}

			max=Math.max(max, g[i]+f[i]);
		}
		System.out.println(max+"  "+maxIdx);
		
	}

}
