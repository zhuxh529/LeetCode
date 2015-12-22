package chap2;
import java.util.*;
public class p2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,4,200,3,5,2,6,11,9,8,12,13,14,15};
		System.out.println(method2(arr));
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
	
	public static int method2(int[] arr){
		int result=1;
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int cur=0;
		for(int i:arr){
			map.put(i,0);
		}
		
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])!=0) continue;
			map.put(i, 1);
			cur=1;
			int index=arr[i];
			while(map.containsKey(--index)){
				cur++;
				map.put(index, 1);
			}
			index=arr[i];
			while(map.containsKey(++index)){
				cur++;
				map.put(index, 1);
			}
			result=result>cur?result:cur;
		}
		
		return result;
	}
	

}
