package chap4;
import java.util.Arrays;
import java.util.Stack;

public class p4_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={101,102,103,100,102,103};
//		System.out.println(rect(arr));
//		System.out.println(largestRectangleArea(arr));
		front(arr);
	}
	
	public static void front(int[] arr){
		int[] f=new int[arr.length];
		int[] b=new int[arr.length];
		Stack<Integer> stk=new Stack<Integer>();

		for(int i=0;i<arr.length;i++){
			if(stk.isEmpty()|| arr[stk.peek()]<arr[i]){
				if(stk.isEmpty()){
					f[i]=-1;
//					stk.add(i);
				}
				else{
					f[i]=stk.peek();
					
				}
			}
			else{
				int x=arr[stk.peek()];
				int xx=0;
				while(x>arr[i]){
					if(stk.isEmpty()){
						xx=-1;
						break;
					}
					xx=stk.peek();
					x=arr[stk.pop()];
				}
				f[i]=xx;
				
			}
			stk.add(i);
		}
		
		System.out.println(Arrays.toString(f));
		stk.clear();
		
		for(int i=arr.length-1;i>=0;i--){
			if(stk.isEmpty()|| arr[stk.peek()]<arr[i]){
				if(stk.isEmpty()){
					b[i]=arr.length;
//					stk.add(i);
				}
				else{
					b[i]=stk.peek();
					
				}
			}
			else{
				int x=arr[stk.peek()];
				int xx=0;
				while(x>arr[i]){
					stk.pop();
					if(stk.isEmpty()){
						xx=arr.length;
						break;
					}
					xx=stk.peek();
					x=arr[xx];
					
				}
				b[i]=xx;
				
			}
			stk.add(i);
		}
		System.out.println(Arrays.toString(b));

		int result=0;
		for(int i=0;i<arr.length;i++){
			int tmp=(b[i]-f[i]-1)*arr[i];
			result=result>tmp?result:tmp;
		}
		System.out.println(result);
		
		
	}
	
	
	
	
	public static int rect(int[] arr){
		Stack<Integer> stk=new Stack<Integer>();
		int result=0;
		int x=0;;
		for(int i=0;i<=arr.length;){
			x=i==arr.length?-1:arr[i];
			if(stk.isEmpty() || x>stk.peek()){
				stk.push(i++);
			}
			else{
				int p=stk.pop();
				int tmp=arr[p]*(stk.isEmpty()?i:(i-1-stk.peek()));
				result=tmp>result?tmp:result;
			}
		}
		return result;
		
	}
	
	public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for (int i = 0; i <= height.length; i++) {
            int curt = (i == height.length) ? -1 : height[i];
            while (!stack.isEmpty() && curt <= height[stack.peek()]) {
                int h = height[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            stack.push(i);
        }
        
        return max;
    }

}
