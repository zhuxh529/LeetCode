package chap2;

public class p2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(steps(8));
	}
	
	public static int steps(int n){
		if(n==1) return 1;
		if(n<=0) return 0;
		return steps(n-1)+steps(n-2);
	}

}
