package ch13;
import java.util.ArrayList;

public class p13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ele=new ArrayList<Integer>();
		ele.add(2);list.add(ele);
		ele=new ArrayList<Integer>();
		ele.add(3);ele.add(4);list.add(ele);
		ele=new ArrayList<Integer>();
		ele.add(6);ele.add(5);ele.add(7);list.add(ele);
		ele=new ArrayList<Integer>();
		ele.add(4);ele.add(1);ele.add(8); ele.add(3);list.add(ele);

		
		System.out.println(list.toString());
		System.out.println(triangle(list));
		
		
	}
	
	public static int triangle(ArrayList<ArrayList<Integer>> list){
		int a, b,set;
		ArrayList<Integer> ele;
		for(int i=list.size()-2;i>=0;i--){
			ele=list.get(i);
			for(int j=0;j<=i;j++){
				a=list.get(i+1).get(j);
				b=list.get(i+1).get(j+1);
				set=ele.get(j)+Math.min(a, b);
				ele.set(j, set);
			}
		}
		
		
		return list.get(0).get(0);
	}

}
