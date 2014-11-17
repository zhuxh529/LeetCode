package chap3;

public class p3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryAdd2("1", "11"));
		
	}
	
	public static String binaryAdd(String s1, String s2){
		int c=0;
		int n1=s1.length()-1, n2=s2.length()-1;
		String result="";
		int a1, a2, sum;
		while(n1>=0 || n2>=0){
			a1=n1<0?0:s1.charAt(n1--)-'0';
			a2=n2<0?0:s2.charAt(n2--)-'0';
			sum=(a1+a2+c)%2;
			c=(a1+a2+c)/2;
			result= ""+sum+result;
			
			
		}
		result=c==1?""+c+""+result:""+result;
		
		
		return result;
		
	}
	
	public static String binaryAdd2(String s1, String s2){
		int l1=s1.length()-1,l2=s2.length()-1, c=0;
		StringBuilder sb=new StringBuilder();
		while(l1>=0 || l2>=0){
			int n1=l1<0?0:s1.charAt(l1)-'0', n2=l2<0?0:s2.charAt(l2)-'0'; 
			int sum=n1+n2+c;
			c=sum/2;
			sb.insert(0, sum%2);
			l1--;
			l2--;
		}
		if(c>0) sb.insert(0, c);
		return sb.toString();

	}
	

}
