package ch15;

public class p15_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(10,3));
	}
	
	public static int divide(int a, int b){
		int result=0;
		int inc=1;
		while(a>=b){
			int bb=b;
			inc=1;
			while(bb<Integer.MAX_VALUE && bb<=a){
				result+=inc;
				inc+=inc;
				a-=bb;
				bb+=bb;
			}
		}
		return result;
	}

}
