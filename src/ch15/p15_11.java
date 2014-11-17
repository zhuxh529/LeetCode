package ch15;

import java.util.Arrays;

public class p15_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m=spiral(5);
		for(int[] a:m){
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static int[][] spiral(int num){
		int[][] ma=new int[num][num];
		int l=0, r=ma[0].length, t=0, b=ma.length,i, x=1;
		while(l<r && t<b){
			for(i=l;i<r;i++){
				ma[t][i]=x++;
			}
			t++;
			for(i=t;i<b;i++){
//				System.out.print(ma[i][r-1]+",");
				ma[i][r-1]=x++;
			}
			r--;
			if(t<b){
				for(i=r-1;i>=l;i--){
//					System.out.print(ma[b-1][i]+",");
					ma[b-1][i]=x++;
				}
				b--;
			}
			if(l<r){
				for(i=b-1;i>=t;i--){
//					System.out.print(ma[i][l]+",");
					ma[i][l]=x++;
					
				}
				l++;
			}
			
			
		}
		
		return ma;

		
	}

}
