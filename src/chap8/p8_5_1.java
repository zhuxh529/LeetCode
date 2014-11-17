package chap8;

import java.util.ArrayList;

public class p8_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int[] arr={1,2,3,4};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		recursion(0, arr, result, list, n,0);
		System.out.println(result.toString());
		
		
		
	}
	
	public static void recursion(int step, int[] arr, ArrayList<ArrayList<Integer>> result, 
			ArrayList<Integer> list, int n, int l){
			if(step==n){
			ArrayList<Integer> l1=new ArrayList<Integer>(list);
			result.add(l1);
			}
		
			for(int i=l;i<arr.length;i++){
				list.add(arr[i]);
				recursion(step+1, arr, result, list, n,i+1);
				list.remove(list.size()-1);
			}
		
	}

}
