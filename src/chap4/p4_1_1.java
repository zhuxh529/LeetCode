package chap4;
import java.util.*;
public class p4_1_1 {
	public static String front="({[";
	public static String back=")}]";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(front.indexOf('['));
		String str="(())[{]";
		System.out.println(parenthesis(str));
	}
	
	public static boolean parenthesis(String orig){
		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i< orig.length();i++){
			char cur=orig.charAt(i);
			if(front.indexOf(cur)>=0){
				stk.add(cur);
			}
			else{
				if(stk.isEmpty()) return false;
				char pop=stk.peek();
				if(front.indexOf(pop)!=back.indexOf(orig.charAt(i))){
//					System.out.println(front.indexOf(pop)+"   "+back.indexOf(orig.charAt(i)));
					return false;
				}
				else{
					stk.pop();
				}		
			}
		}
		return true;
		
	}
	

}
