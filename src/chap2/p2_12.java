package chap2;

import java.util.Arrays;

public class p2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=687432;
		System.out.println(nextPerm(x));
	}
	
	public static int nextPerm(int orig){
		int result=0, tmp=orig;
		int num=0;
		
		while(tmp>0){
			tmp/=10;
			num+=1;
		}
		int[] arr=new int[num];
		tmp=orig;
		
		while(tmp>0){
			arr[--num]=tmp%10;
			tmp/=10;
		}
		
		
		System.out.println(Arrays.toString(arr));
		int p,c;
		int i=arr.length-2;
		while(arr[i]>arr[i+1]){
			i--;
		}
		p=i;
		i=arr.length-1;
		while(arr[p]>arr[i])i--;
		c=i;
		int tmp1=arr[p];
		arr[p]=arr[c];
		arr[c]=tmp1;
		
		reverse(arr, p+1);
		System.out.println(Arrays.toString(arr)+"  "+c+"  "+p);
		
		return result;
	}
	public static void reverse(int[] arr, int l){
		int x=l,y=arr.length-1;
		while(x<=y){
			int t=arr[x];
			arr[x++]=arr[y];
			arr[y--]=t;
		}
	}

}
