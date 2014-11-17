package ch15;

public class p15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234));
	}
	
	public static int reverse(int x){
		int ret=0;
		for(;x!=0;x/=10){
			ret=10*ret+x%10;
		}
		return ret;
	}

}
