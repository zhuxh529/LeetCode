package chap3;

public class p3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result is :"+ method2("ad*f".toCharArray(),"adbcdef".toCharArray(),0,0));
		
	}
	
	public static boolean match(String a, String b){
		char [] aa=a.toCharArray();
		char [] bb=b.toCharArray();
		int i=0,j=0, i0=0,j0=0;
		boolean star=false;
		while( j<b.length() && i<a.length()){
			switch(aa[i]){
				case '?':
					i++;j++;
					System.out.println("?");

					break;
				case '*':
					star=true;
					i0=i;
					j0=j;
					while(i0<aa.length && aa[i0]=='*') i0++;
					if(i0>=aa.length) return true;
					//j=j0;
					i=i0;
					j++;
					System.out.println("*");

					break;
				default:
					if(aa[i]!=bb[j]){
						if(star==false){
							return false;
						}
						j0++;
						i=i0;
						j=j0;

					}
					else{
						i++;
						j++;
						
					}
			
			}
			
		}
		
//		i--;
		while(i<aa.length && aa[i]=='*') i++;
//		System.out.println(i+"   "+aa.length);
		return i==aa.length; 
		
	}

	
	
	public static boolean method2(char[] a, char[] b, int p, int s){
		
		if(p<a.length && a[p]=='*'){
			while(a[p]=='*') p++;
			if(p==a.length) return true;
			while(s<b.length && !method2(a,b,p, s)){
				++s;
			}
			System.out.println(s!=b.length);

			return s!=b.length;
			
		}
		else if(p==a.length || s==b.length) {
			System.out.println(p==a.length && s==b.length);
			return (p==a.length && s==b.length);}
		else if(a[p]==b[s] || a[p]=='?'){ 
			System.out.println(a[p]+"  "+b[s]);
			return method2(a,b,++p, ++s);}
		else return false;
		
	}
}
