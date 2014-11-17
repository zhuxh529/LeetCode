package ch15;
import java.util.*;

public class p15_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = paskal(5);
		System.out.println(list);
	}
	
	public static ArrayList<Integer> paskal(int num){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int cur=1;
		for(int i=0;i<num;i++){
			for(int j=i-1;j>=0;j--){
				list.set(j, getSum(list, j));
			}
			list.add(1);
		}
		return list;
		
	}
	
	public static int getSum(ArrayList<Integer> l, int i){
		if(i==0) return l.get(0);
		return l.get(i-1)+l.get(i);
	}
	
	

}
