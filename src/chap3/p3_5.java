package chap3;

public class p3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pal("abcbabcabcbccccc"));
	}
	
	public static String pal(String a){
		StringBuilder str=new StringBuilder();
		for(char c:a.toCharArray()){
			str.append("#"+c);
		}
		str.append("#");
		String s=str.toString();
		
		int ct=1;
		int start=0, len=0;
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			ct=1;
			while(i-ct>=0 &&i+ct<s.length() && s.charAt(i-ct)==s.charAt(i+ct)){
				ct++;
			}
			ct--;
//			System.out.println(ct);
			if(2*ct>len){
				len=2*ct;
				start=i-ct;
//				System.out.println(s.substring(start, start+len+1));
			}
		}
		String result=s.substring(start, start+len+1);
		result=result.replaceAll("#", "");
		return result;
		
	}

}
