package ch15;
import java.util.*;
public class p15_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"This", "is", "an", "example", "of", "text", "justification."};
		text(arr,16);
//		String test=line(arr, 0,3, 16);
//		System.out.println(test+ "  "+test.length());
	}
	
	public static void text(String[] arr, int L){
		int sum=0;
		ArrayList<String> list=new ArrayList<String>();
		int begin=0;
		for(int i=0; i<arr.length;i++){
			sum+=arr[i].length()+1;
			if(sum>L){
				list.add(line(arr, begin, i, L));
				begin=i;
				sum=0;
			}
			

		}
		list.add(line(arr, begin, arr.length, L));
//		System.out.println(list);
		for(String e: list){
			System.out.println(e+ "   "+e.length());
		}

		
	}
	
	public static String line(String[] arr, int l, int r, int L){
		String[] list=new String[r-l];
		int sum=0;
		for(int i=l;i<r;i++){
			list[i-l]=arr[i];
			sum+=arr[i].length();
		}
		
		int j=0;
		while(sum<L){
			int div=(r-l-1)!=0?(r-l-1):1;
			list[j++%div]+=" ";
			sum++;
		}
		String result="";
		for(String s: list){
			result+=s;
		}
		
		return result;
		
	}
	
	

}
