package chap2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class p2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-1,2,1,-4};
//		ArrayList list=method1(arr,0);
//		System.out.println(list);
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		System.out.println(sides(arr,1));

	}
	
	public static int sides(int[] arr, int tar){
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(arr);
		int close=Integer.MAX_VALUE/2, x=0,y=0,z=0;
		for(int i=0; i<arr.length-1;i++){
			int l=i+1, r=arr.length-1;
			while(l<r){
				int sum=arr[i]+arr[l]+arr[r];
//					System.out.println(sum+" "+arr[i]+"  "+l);
					if(Math.abs(close-tar)>Math.abs(sum-tar)){
						close=sum;
						x=i;y=l;z=r;
						while(l<r&& arr[l+1]==arr[l]) l++;
						while(l<r&& arr[r-1]==arr[r]) r--;
					}
				
				
				if(sum>tar){
					r--;
				}
				else{
					l++;
				}
			}
			
		}
		System.out.println(arr[x]+" "+arr[y]+" "+arr[z]);
		return close;
	}

}
