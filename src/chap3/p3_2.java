package chap3;

public class p3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method2("hello dude, what's up","dude"));
		
	}

	public static String strStr(String haystack, String needle) {
		 
		int needleLen = needle.length();
		int haystackLen = haystack.length();
	 
		if (needleLen == haystackLen && needleLen == 0)
			return "";
	 
		if (needleLen == 0)
			return haystack;
	 
		for (int i = 0; i < haystackLen; i++) {
			if (haystackLen - i + 1 < needleLen)
				return null;
	 
			int k = i;
			int j = 0;
	 
			while (j < needleLen && k < haystackLen && needle.charAt(j) == haystack.charAt(k)) {
				j++;
				k++;
				if (j == needleLen)
					return haystack.substring(i);
			}
	 
		}
	 
		return null;
	}
	
	
	public static String method1(String orig, String find) {
		
		int j=0;
		for(int i=0;i<orig.length()-find.length()+1;i++){
			if(orig.charAt(i)==find.charAt(0)){
				j++;
				while(j<find.length() && i+j<orig.length() && orig.charAt(i+j)==find.charAt(j)){
					j++;
				}
				if(j==find.length()){
					return orig.substring(i); 	
				}
				else{
					System.out.println(j);
					j=0;
				}
			}
			
		}
		
		return null;
		
	}
	
	
	public static String method2(String orig, String find) {
		int j=0;
		for(int i=0; i<orig.length()-find.length();i++){
			for(j=0;j<find.length();j++){
				if(orig.charAt(i+j)!=find.charAt(j)) break; // care here
			}
			if(j==find.length()) return orig.substring(i);
		}
		return null;
	
	}
	
	
}
