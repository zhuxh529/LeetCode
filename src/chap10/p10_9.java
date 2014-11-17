package chap10;

public class p10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ppp(3,0,0,"");
	}
	
	public static void ppp(int num, int cur, int r, String path){
		if(   cur==0 &&((r==num ) || (cur+r==num))){
			System.out.println(path);
			System.out.println();
			return;
		}
		
		if(cur>0 && r<=num){
			String a=path;
			path+=")";
			ppp(num, cur-1, r+1, path);
			path=a;
		}
		if(cur+r<=num){
			String a=path;
			path+="(";
			ppp(num, cur+1, r, path);
			path=a;
		}
		
		
	}

}
