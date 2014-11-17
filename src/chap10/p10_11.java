package chap10;

public class p10_11 {
	public static void main(String[] args) {
		char[][] b={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
		System.out.println(find(b, "see"));
	}
	public static boolean find(char[][] b, String str){
		for(int i=0; i<b[0].length;i++){
			for(int j=0;j<b.length;j++){
				if(b[j][i]==str.charAt(0)){
					int[][] visit=new int[b.length][b[0].length];
					boolean bb=dfs(b, str,visit, j,i,0);
					if(bb==true) return true;
				}
			}
		}
		return false;
		
	}
	
	public static boolean dfs(char[][] b, String str, int[][] visit, int x, int y, int idx){
		if(idx>=str.length()) return true;
		if(x>=b.length || x<0 || y>=b[0].length || y<0 || str.charAt(idx)!=b[x][y] || visit[x][y]==1) return false;
		visit[x][y]=1;
		boolean result=dfs(b, str,visit, x+1,y,idx+1) ||
				dfs(b, str,visit, x-1,y,idx+1) ||
				dfs(b, str,visit, x,y+1,idx+1) ||
				dfs(b, str,visit, x,y-1,idx+1);
		visit[x][y]=0;
		return 	result;
		
	}
}
