package chap10;
import java.util.*;

public class p10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abba";
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		ArrayList<String> path=new ArrayList<String>();
		palindrome(a, result, path, 0);
		for(ArrayList<String> p: result){
			System.out.println(p.toString());
		}
	}
	
	public static void palindrome(String orig, ArrayList<ArrayList<String>> result,
			ArrayList<String>path, int l){
		
		if(l==orig.length()){
			ArrayList<String> arr=new ArrayList<String>(path);
			result.add(arr);
		}
		
		for(int i=l+1;i<=orig.length();i++){
			if(isPa(orig,l,i-1)){
				path.add(orig.substring(l, i));
				palindrome(orig, result, path, i);
				path.remove(path.size()-1);
			}
		}
		
		
		
	}

	public static boolean isPa(String a, int l, int r){
		while(l<r && a.charAt(l)==a.charAt(r)){
			l++;
			r--;
		}
		return l>=r;
		
	}
}
