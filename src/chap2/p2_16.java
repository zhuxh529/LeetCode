package chap2;

public class p2_16 {
	public static void main(String[] args) {
		int[][] m={{1,2,3,4},{11,12,13,14},{21,22,23,24},{31,32,33,34}};
		print(m);
		method2(m);
		System.out.println();
		print(m);
		
	}
	
	
	public static void method1(int[][] m){
		int len=m.length;
		for(int lay=0;lay<m.length/2;lay++){
			int last=len-lay-1;
			int first=lay;
			int offfirst=len-1;
			int tmp;
			for(int i=first;i<last;i++){
				
				tmp=m[len-1-i][lay];
				m[len-1-i][lay]=m[last-lay][len-1-i];
				m[last-lay][len-1-i]=m[i][last-lay];
				m[i][last-lay]=m[lay][i];
				m[lay][i]=tmp;
				
			}
			
		}
		
	}
	
	
	public static void method2(int[][] m){
		
		for(int lay=0;lay<(m.length+1)/2;lay++){
			int start=lay, end=m.length-1-lay;
			for(int i=start; i< end;i++){
				int top=m[lay][i];
				m[lay][i]=m[m.length-1-i][lay];
				m[m.length-1-i][lay]=m[end][m.length-1-i];
				m[end][m.length-1-i]=m[i][end];
				m[i][end]=top;
			}
		}
		
//		print(m);
	}
	
	public static void print(int[][] m){
		for(int i=0;i<m[0].length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+", ");
			}
			System.out.println();
		}
		
	}

}
