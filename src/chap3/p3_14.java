package chap3;
import java.util.Arrays;
import java.util.Stack;

public class p3_14 {
	public static void main(String[] args) {
		String a=path("//bb/../../cc//dd/");
		System.out.println(a);
		
		
	}

	public static String path(String orig){
		Stack<String> s=new Stack<String>();
		int idx=0;
		String[] arr=orig.split("/");
//		System.out.println(Arrays.toString(arr));
		
		for (String elem: arr){
			if(elem.length()==0 || elem.equals(".")){
				continue;
			}
			if(elem.equals("..")){
				if(!s.empty()){
					s.pop();
				}
			}
			else{
				s.push(elem);
			}
		}
		
		String result="";
		String tmp="";
		while(!s.empty()){
			tmp=s.pop();
			if(result.length()==0) result=tmp;
			else result=tmp+"/"+result;
		}
		
		if(orig.length()>=2 && orig.charAt(0)=='/'){
			result="/"+result;
		}		
		
		return result;
		
	}
}
