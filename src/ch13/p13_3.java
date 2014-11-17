package ch13;
import java.util.ArrayList;
import java.util.Arrays;

public class p13_3 {
	public static void main(String[] args) {
	
			String str="abddccdd";
			palindrome(str);
	
	}
	
	public static void palindrome(String str){
		int n=str.length();
		boolean[][] m=new boolean[n][n];
		for(int i=0; i<n;i++){
			m[i][i]=true;
		}
		
		for(int i=n-1;i>=0;i--){
			for(int j=i+1; j<n;j++){
				if(str.charAt(i)==str.charAt(j)){
					if(m[i+1][j-1] || j-i<2){
						m[i][j]=true;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(Arrays.toString(m[i]));
		}
		
		
		
		 int[] minCut = new int[n + 1];
	        for (int i = n; i >= 0; i--)
	            minCut[i] = n - 1 - i;
	        System.out.println(Arrays.toString(minCut));
	        for (int i = n - 1; i >= 0; i--) {
	            for (int j = i; j < n; j++) {
	                if (m[i][j]) {
	                    minCut[i] = Math.min(minCut[i], 1 + minCut[j + 1]);
	                }
	            }
	            System.out.println(Arrays.toString(minCut));
	        }
	        System.out.println(minCut[0]);
		
	}
	
}
