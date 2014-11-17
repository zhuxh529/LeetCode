package chap2;

import java.util.ArrayList;
import java.util.Arrays;

public class p2_17 {
	public static void main(String[] args) {
		int[] arr={9,9,9};
		System.out.println(method2(arr));
	}
	
	public static int[] method1(int[] num){
		int c=0;
		int dig=9;
		int tmp=0;
		c=dig;
		for(int i=num.length-1;i>=0;i--){
			tmp=num[i]+c;
			if(tmp>=10){
				c=1;
			}
			else{
				c=0;
			}
			dig=tmp%10;
			System.out.println(dig);
			num[i]=dig;
			
			
		}
		int start=0;
		int[] ret;
		if(c==1){
			ret=new int[num.length+1];
			ret[0]=1;
			start=1;
		}
		else{
			ret=new int[num.length];
		}
		
		for(int i=start; i<ret.length;i++){
			ret[i]=num[i-start];
		}
		return ret;
		
	}
	
	
	public static ArrayList<Integer> method2(int[] num){
		int c=0;
		int add=1;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int e: num){
			list.add(e);
		}
		int len=num.length-1;
		for(int i=num.length-1;i>=0;i--){
			int tmp=c+add%10+list.get(i);
			add/=10;
			list.set(i, tmp%10);
			c=tmp/10;
		}
		if(c!=0){
			list.add(0,c);
		}
		Object[] arrr=list.toArray();
		return list;
	}


}
