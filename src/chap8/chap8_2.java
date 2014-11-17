package chap8;

import java.util.ArrayList;

public class chap8_2 {
	public static void main(String[] args) {
		int[] arr={1,2,2};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		recursion(0, arr, result, list);
		System.out.println(result.toString());
	}
	
	public static void recursion(int step, int[] arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
			ArrayList<Integer> l=new ArrayList<Integer>(list);
			result.add(l);
		
		
		
		for(int i=step;i<arr.length;i++){
			if(i!=step && arr[i]==arr[i-1] ) continue;
			list.add(arr[i]);
			recursion(i+1, arr, result, list);
			list.remove(list.size()-1);
			
		}
		

		
		
	}
	
	public static void recursion1(int step, int[] arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
		if(step==arr.length){
			ArrayList<Integer> l=new ArrayList<Integer>(list);
			result.add(l);
			return;
		}
		
			recursion1(step+1, arr, result, list);
			
			if(!(step>0 && arr[step]==arr[step-1] && !list.contains(arr[step]))){
				list.add(arr[step]);
				recursion1(step+1, arr, result, list);
				list.remove(list.size()-1);
			}
			
		
		
	}
}
