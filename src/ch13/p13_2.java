package ch13;

import java.util.ArrayList;

public class p13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(subArray(arr));
	}

	public static ArrayList<Integer> subArray(int[] arr){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		int max=Integer.MIN_VALUE;
		int l=0,r=0;
		for(int i=0; i<arr.length; i++){
			if(sum<0){
				sum=0;
				l=i;
			}
			if(sum>max){
				max=sum;
				r=i;
			}
			sum+=arr[i];
		}
		list.add(max);
		list.add(l);
		list.add(r);
		return list;
		
		
	}
}
