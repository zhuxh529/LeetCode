package chap4;
import java.util.Stack;
public class p4_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"4", "2","+","3","/"};
		System.out.println(arith(arr));
	}

	public static int arith(String[] arr){
		Stack<Integer> stk=new Stack<Integer>();
		String op="+-*/";
		
		for(String s:arr){
			int idx=op.indexOf(s);
			if(idx==-1){
				stk.add(Integer.parseInt(s));
			}
			else{
				int b=stk.pop();
				int a=stk.pop();
				switch(idx){
					case 0:
						stk.push(a+b);
						break;
					case 1:
						stk.push(a-b);
						break;
					case 2:
						stk.push(a*b);
						break;
					case 3:
						stk.push(a/b);
						break;
						
				}
			}
		}
		return stk.pop();
	}
}
