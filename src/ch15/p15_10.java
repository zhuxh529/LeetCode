package ch15;

public class p15_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m={{1,2,3,11},{4,5,6,12},{7,8,9,13}};
		spiral(m);
	}

	public static void spiral(int[][] ma){
		int l=0, r=ma[0].length, t=0, b=ma.length,i;
		while(l<r && t<b){
			for(i=l;i<r;i++){
				System.out.print(ma[t][i]+",");
			}
			t++;
			for(i=t;i<b;i++){
				System.out.print(ma[i][r-1]+",");
			}
			r--;
			if(t<b){
				for(i=r-1;i>=l;i--){
					System.out.print(ma[b-1][i]+",");
				}
				b--;
			}
			if(l<r){
				for(i=b-1;i>=t;i--){
					System.out.print(ma[i][l]+",");
				}
				l++;
			}
		}
		
	}
}
