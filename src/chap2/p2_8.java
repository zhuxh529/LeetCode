package chap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class p2_8 {
	public static ArrayList<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>> ();
	public static HashSet<ArrayList<Integer>> set=new HashSet<ArrayList<Integer>>();
	public static void main(String[] args) {
		int[] arr={-1,0,1,2,-4,4,8,-3,-5};
//		ArrayList list=method1(arr,0);
//		System.out.println(list);
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		method2(arr,1,4, list);
		System.out.println(list1);
		ArrayList<ArrayList<Integer>> list2=sides(arr);
		System.out.println(list2);
	
	}
	
	public static ArrayList method1(int[] arr, int sum){
		ArrayList<Integer> ret=new ArrayList<Integer>();
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	for(int ele: arr){
			if(map.get(ele)==null){
			map.put(ele, 1);
			}
			else{
				map.put(ele, map.get(ele)+1);
			}
		}
		
		Arrays.sort(arr);
		int cur,sec, rem;
		for(int i=0;i<arr.length;i++){
			cur=arr[i];
			for(int j=i+1;j<arr.length;j++){
				sec=arr[j];
				rem=sum-cur-sec;
				if(map.get(rem)!=null && rem!=sec && sec< rem){
					ret.add(cur);
					ret.add(sec);
					ret.add(rem);
					System.out.println(cur+"   "+sec+"    "+ rem);
					
				}
			}
			map.remove(cur);
			
		}
		
		return ret;
		
		
		
	}

	
	public static void method2(int[] arr, int sum,int step, ArrayList<Integer> list){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int e:arr){
			if(map.get(e)==null) map.put(e, 1);
			else map.put(e, map.get(e)+1);
		}
		recurse(map, sum, step, list);
		
	
	}
	
	public static void recurse(HashMap<Integer, Integer> map, int sum, int step, ArrayList<Integer> list){
		if(step==1){
			if(map.get(sum)!=null && map.get(sum)>0){
				ArrayList<Integer> l=new ArrayList<Integer>(list);
				l.add(sum);
				Collections.sort(l);
//				System.out.println(l);
				int code=0;
				if(!set.contains(l))
				{
					list1.add(l);
					set.add(l);
				}
			}
			else{
				return;
			}
		}
		for(Integer e:map.keySet()){
			int c=map.get(e);
			if(c>0){
				map.put(e,c-1);
				list.add(e);
				recurse(map, sum-e,step-1, list);
				list.remove(list.size()-1);
				map.put(e, c);
			}
			
		}
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> sides(int[] arr){
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++){
			int l=i+1, r=arr.length-1;
			while(l<r){
				int sum=arr[i]+arr[l]+arr[r];
				if(sum==0) {
					ArrayList<Integer> tmp=new ArrayList<Integer>();
					tmp.add(arr[i]);tmp.add(arr[l]);tmp.add(arr[r]);
					list.add(tmp);
					while(l<r&& arr[l+1]==arr[l]) l++;
					while(l<r&& arr[r-1]==arr[r]) r--;
				}
				
				if(sum>0){
					r--;
				}
				else{
					l++;
				}
			}
			
		}
		return list;
	}
}
