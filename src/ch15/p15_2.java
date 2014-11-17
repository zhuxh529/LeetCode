package ch15;

public class p15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome(1));
	}
	
	public static boolean palindrome(int x){
		int d=1;
		while(x/d>=10) d*=10;
		while(x>0){
			int l,r;
			l=x/d;
			r=x%10;
			if(l!=r) return false;
			x=x%d/10;
			d/=100;
		}
		return true;
	}

}
