package chap10;
import java.util.*;

public class p10_5 {
//	public static ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result=new int[5];
		for(int i=0; i<result.length;i++){
			result[i]=-1;
		}
		System.out.println(queen(result, 0));
		
	}
	
	public static int queen(int[] result, int row){
		if(row==result.length){
//			System.out.println(Arrays.toString(result));
			draw(result);
			return 1;
		}
		int sum=0;
		for(int i=0;i<result.length;i++){
			if(Valid(result, row, i)){
				result[row]=i;
				sum+=queen(result, row+1);
				result[row]=-1;
			}
		}
		
		return sum;
	}
	
	public static boolean Valid(int[] result, int row, int col){
		for(int i=0;i<row;i++){
			if(result[i]==col) return false;
			if(row-i==Math.abs(result[i]-col)) return false;
		}
		
		return true;
	}
	
	public static void draw(int[] m){
		System.out.println();
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				String cur=m[i]==j?"Q":"X";
				System.out.print(cur+" ");
			}
			System.out.println();
		}
		
	}

}
