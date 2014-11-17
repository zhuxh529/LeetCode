package chap2;
import java.util.*;
public class p2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=gray(4);
		for(Integer e:a){
			System.out.print(Integer.toString(e, 2)+" ");
		}
	}
	
	public static ArrayList<Integer> gray(int n){
		if(n==1){
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(0);
			list.add(1);
			return list;
		}
		ArrayList<Integer> list=gray(n-1);
		for(int i=list.size()-1;i>=0;i--){
//			System.out.println(1<<(n-1));
			int a=list.get(i)+(1<<(n-1));
			list.add(a);
		}
		
		return list;
	}

	
}
