package chap4;

public class p4_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="))(((";
		System.out.println(longest(a));
	}
	
	public static int longest(String orig){
		char[] arr=orig.toCharArray();
		int valid=0;
		int max=0;
		int prev=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='('){
				valid++;
			}
			else{
				valid--;
				if(valid<0) prev=i+1;
				valid=valid<0?0:valid;
			}
			if(valid==0){
//				System.out.println(i+ "  "+prev);
				max=max>(i-prev)?max:(i-prev);
			}
			
		}
		
		return max==0?0:max+1;
		
	}

}
