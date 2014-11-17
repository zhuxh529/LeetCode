package chap10;

public class p10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursion(5,9));
	}
	
	public static int recursion(int m, int n){
		if(m==1 && n==1) return 1;
		if(m<1 || n<1) return 0;
		
		return recursion(m-1, n) + recursion(m, n-1);
		
	}

}
