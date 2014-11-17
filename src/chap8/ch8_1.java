package chap8;
import java.util.*;

public class ch8_1 {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		general(0, arr, result, list);
		System.out.println(result.toString());
//		bit(arr, result);
	}
	
	public static void recursion(int step, int[] arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
		if(step==arr.length){
			ArrayList<Integer> l=new ArrayList<Integer>(list);
			result.add(l);
			return;
		}
		
		recursion(step+1, arr, result, list);
		list.add(arr[step]);
		recursion(step+1, arr, result, list);
		list.remove(list.size()-1);
		
		
	}
	
	
	public static void bit(int[] arr, ArrayList<ArrayList<Integer>> result){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=arr.length;
		ArrayList<Integer> l;
		for(int i=0;i<1<<n;i++){
			for(int j=0;j<n;j++){
				if((i>>j & 1 )==1){
					list.add(arr[j]);
				}
			}
			l=new ArrayList<Integer>(list);
			result.add(l);
			list.clear();
		}
		
		System.out.println(result.toString());
		
	}
	
	public static void general(int step, int[] arr, 
			ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
		
		result.add(new ArrayList<Integer>(list));
		for(int i=step;i<arr.length;i++){
			list.add(arr[i]);
			general(i+1, arr, result, list);
			list.remove(list.size()-1);
		}
	}

}
