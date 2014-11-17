package chap3;

public class p3_1 {
	public static void main(String[] args) {
		String str="ancnas";
//		System.out.println(palindrome(str));
		String test="A man, A plan, a canal: Panama";
		System.out.println(pal3(test));
	}
	
	public static boolean palindrome(String str){
		int l=0,r=str.length()-1;
		char[] arr=str.toCharArray();
		while(l<r){
			if(arr[l++]!=arr[r--]) return false;
		}
		return true;
		
	}
	
	public static boolean pal2(String str){
		int l=0,r=str.length()-1;
		char[] arr=str.toCharArray();
		while(l<r && arr[l]==arr[r]){
			l++;
			r--;
		}
		return l>=r;
	}
	
	public static boolean pal3(String str){
		str=str.toLowerCase();
		char[] a=str.toCharArray();
		int l=0,r=a.length-1;
		while(l<r){
			if(a[l]>'z' || a[l]<'a'){
				l++;
			}
			else if(a[r]>'z' || a[r]<'a'){
				r--;
			}
			else if(a[r]!=a[l]){
				return false;
			}
			else{
				l++;
				r--;
			}
		}
		return true;
		
	}

}
