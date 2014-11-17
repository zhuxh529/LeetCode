package chap3;

public class p3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result is :"+ match("*f","adbcdef"));

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

}
