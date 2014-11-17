package chap3;

public class p3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(say(5));
		
	}
	
	public static String getNext(int n){
		String a="1";
		String tmp="";
		char prev=' ';
		int ct=0;
		
		for(int i=0; i< n;i++){
			for(int j=0; j<a.length();j++){
				if(a.charAt(j)!=prev){
					if(j!=0){
					tmp+=ct+""+prev;
					prev=a.charAt(j);
					ct=1;
					}
					else{
						prev=a.charAt(j);
						ct=1;
					}
				}
				else{
					ct++;
				}
			}
			tmp+=ct+""+a.charAt(a.length()-1);
			a=tmp;
			tmp="";
			ct=0;
			
		}
		
		return a;
		
	}
	
	public static String say(int n){
		String result="1";
		char prev=' ';
		int count=0;
		String tmp="";
		while(--n>0){
			tmp="";
			for(int i=0;i<result.length();i++){
				count=1;
				while((i+1)<result.length() && result.charAt(i)==result.charAt(i+1)){
					i++;
					count++;
				}
				tmp+=count+""+result.charAt(i);
			}
			result=tmp;
			
		}
		return result;
		
	}

}
