package chap2;

import java.util.Arrays;

public class p2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m={{1,1,0,1},{1,1,1,1},{1,1,1,1},{1,1,0,1}};
		set0(m);
		print(m);
	}
	
	public static void set0(int[][] m){
		int r0=0,c0=0;
		for(int i=0; i<m.length;i++){
			if(m[0][i]==0) c0=1;
			if(m[i][0]==0) r0=1;
		}
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				if(m[i][j]==0){
					m[i][0]=0;
					m[0][j]=0;
				}
			}
		}

		for(int i=1; i<m.length;i++){
			if(m[i][0]==0){
				for(int j=1;j<m[0].length;j++){
					m[i][j]=0;
				}
			}
		}
//		print(m);

		for(int j=1; j<m[0].length;j++){
			if(m[0][j]==0){
				for(int i=1;i<m.length;i++){
					m[i][j]=0;
				}
			}
		}
		
		if(r0==1){
			for(int i=0; i<m.length;i++){
				m[i][0]=0;
			}
		}
		if(c0==1){
			for(int i=0; i<m[0].length;i++){
				m[0][i]=0;
			}
		}
		
	}
	
	public static void print(int[][] m){
		for(int[] x: m){
			System.out.println(Arrays.toString(x));
		}
	}

}
