package ch11;

public class p11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5,3));
	}
	
	
	public static double pow(double x, int n){
		if(n<0) return 1/pp(x,-n);
		else return pp(x,n);
		
	}
	
	public static double pp(double x, int n){
		if(n==0) return 1;
		if(n==1) return x;
		
		int l,r;
		l=n/2;
		r=n-l;
		
		return pp(x,l)*pp(x,r);
	}
}
