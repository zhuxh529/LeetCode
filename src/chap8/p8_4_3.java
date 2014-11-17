package chap8;

import java.util.ArrayList;

public class p8_4_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,2,2};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int[] visit=new int[arr.length];
		recursion(0, arr, result, list, visit);
		System.out.println(result.toString());
		
	}
	
	public static void recursion(int step, int[] arr, ArrayList<ArrayList<Integer>> result, 
			ArrayList<Integer> list, int[] visit){
		if(step==arr.length){
		ArrayList<Integer> l=new ArrayList<Integer>(list);
		result.add(l);
		}
	
		for(int i=0;i<arr.length;i++){
			if(visit[i]==0){
				if(i>0 && arr[i] == arr[i-1] && visit[i-1] ==1) continue;
				visit[i]=1;
				list.add(arr[i]);
				recursion(step+1, arr, result, list, visit);
				list.remove(list.size()-1);	
				visit[i]=0;
			}
		}
	}
}
