package chap3;

public class p3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("-12331j123"));
	}
	
	public static int atoi(String s){
		int idx=0;
		int sign=1;
		if(s.charAt(idx)=='+') idx++;
		else if(s.charAt(idx)=='-') {
			idx++;
			sign=-1;
		}
		int num=0;
		for(;idx<s.length();idx++){
			if(s.charAt(idx)>'9' || s.charAt(idx)<'0') break;
			num=10*num+s.charAt(idx)-'0';
			if(num>Integer.MAX_VALUE) break;
		}
		
		if(num*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
		if(num*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
		return sign*num;
		
	}

}
