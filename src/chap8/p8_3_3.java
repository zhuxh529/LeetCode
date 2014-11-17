package chap8;

import java.util.ArrayList;

public class p8_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		recursion(0, arr, result, list);
		System.out.println(result.toString());
		
	}
	
	public static void recursion(int step, int[] arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
		if(step==arr.length){
		ArrayList<Integer> l=new ArrayList<Integer>(list);
		result.add(l);
		}
	
		for(int i=0;i<arr.length;i++){
			if(list.contains(arr[i])) continue;
			list.add(arr[i]);
			recursion(step+1, arr, result, list);
			list.remove(list.size()-1);
			
		}
	

	
	
	}
	

}
