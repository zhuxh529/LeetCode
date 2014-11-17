package chap2;
import java.util.*;
public class p2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,4,200,3,5,2,6,11,9,8,12,13,14,15};
		System.out.println(method1(arr));
	}
	
	public static int method1(int[] arr){
		int ret=1;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>(); 
		HashSet<Integer> set= new HashSet<Integer>(); 
		for(int n: arr){
			map.put(n, 0);
			set.add(n);
		}
		
		for(int n:arr){
			int len=1;
			int tmp=n;
			if(!set.contains(n)) continue;
			set.remove(n);
			while(set.contains(--tmp)){
				len++;
				set.remove(tmp);
			}
			tmp=n;
			while(set.contains(++tmp)){
				len++;
				set.remove(tmp);
			}
			ret=ret>len?ret:len;
			
		}
		
		
		return ret;
	}

}
