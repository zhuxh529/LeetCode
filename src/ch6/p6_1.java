package ch6;

import java.util.Arrays;

public class p6_1 {
	public static void main(String[] args) {
		int[] a={1,3,5,7,9,0,0,0,0,0};
		int[] b={-1,6,8};
		sort(a,b, 5);
		System.out.println(Arrays.toString(a));
		
	}
	public static void sort(int[] a, int[] b, int la){
		int len=la+b.length-1, lb=b.length-1;
		la--;
		while(la>=0 && lb>=0){
			a[len--]=a[la]>b[lb]?a[la--]:b[lb--];
		}
		while(lb>=0){
			a[len--]=b[lb--];
		}
		
	}
	
}
