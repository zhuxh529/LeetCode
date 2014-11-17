package chap2;
import java.util.*;
public class p2_13 {
	static int kk;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kth(3,6);
	}
	
	public static void kth(int n, int k){
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=i+1;
		}
		kk=k;
		ArrayList<Integer> list=new ArrayList<Integer>();
		 rec(arr,n,list);
	}
	
	public static void rec(int[] arr,int n, ArrayList<Integer> x){
		if(n==0){
			kk--;
			if(kk==0) System.out.println(x);
			return;
		}
		
		for(int i=0;i<arr.length;i++){
			if(x.contains(arr[i])) continue;
			x.add(arr[i]);
			rec(arr, n-1, x);
			x.remove(x.size()-1);
		}
	}

}
