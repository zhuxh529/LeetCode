package ch15;
import java.util.*;

public class p15_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list=pascal(5);
		System.out.println(list);

	}
	
	public static ArrayList<ArrayList<Integer>> pascal(int num){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp=new ArrayList<Integer>();
		tmp.add(1);
		result.add(tmp);
		int cur=1;
		while(cur<num){
			
			tmp=new ArrayList<Integer>();
			for(int i=0;i<cur+1;i++){
				int sum=getSum(result.get(cur-1),i);
				tmp.add(sum);
			}
			result.add(tmp);
			
			
			cur++;
		}
		
		
		return result;
		
	}
	
	public static int getSum(ArrayList<Integer> prev, int i){
		if(i==0){
			return prev.get(0);
		}
		if(i==prev.size()){
			return prev.get(i-1);
		}
		return prev.get(i-1)+prev.get(i);
	}

}
