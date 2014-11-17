package chap2;

import java.util.ArrayList;
import java.util.Arrays;

public class p2_10 {
	public static void main(String[] args) {
		int[] arr={63, 21, 78, 45, 59, 62, 37, 22, 19, 101};
		boolean [][] m=method1(arr, 200,arr.length);
		
//		for(int i=0; i<m.length;i++){
//			System.out.println(Arrays.toString(m[i]));
//		}
		
		ArrayList list=reconstruct(m, arr);
		System.out.println(list.toString());
		
		

	
	
	}
	
	
	public static ArrayList reconstruct(boolean[][] m, int[] arr){
		ArrayList<ArrayList> list=new ArrayList<ArrayList>();
		
		int i=m.length-1,j=m[0].length-1;
		
		reconstruct(m, list, i, j, arr, new ArrayList());
		
		return list;
			
	}
	
	
	public static int reconstruct(boolean [][] m, ArrayList<ArrayList> list, int i, int j, int[] arr, ArrayList elem){
//		System.out.println(i+"  "+j);
		ArrayList ele;
		if(i==0) {
//			System.out.println(arr[j]+"   "+j);
			ele=new ArrayList(elem);
			list.add(ele);
			return list.size()-1;
			}
		if(i<0) return -1;
		
		if(m[i][j]==false) return -1;

		
		ele=new ArrayList(elem);
		ele.add(arr[j-1]);
		int up=reconstruct(m,list, i-arr[j-1], j-1, arr,ele);
//		if(up>=0){
//			ArrayList ele=list.get(up);
//			ele.add(arr[j-1]);
//		}
		
			
		int left=reconstruct(m,list, i, j-1, arr, elem);
		
//		if(left>=0 && up >=0){
//			System.out.println(i+"   "+j+"  here is a branch");
//			return up;
//		}
		
		if(left>=0 || up >=0){
			return left>=0?left:up;
		}
		
		return -1;
		

		
		
		//		boolean has=reconstruct(m,list);
		
		
	}
	
	public static boolean[][] method1(int[] arr, int sum, int n){
		boolean [][] m=new boolean[sum+1][n+1];
		for(int i=0; i<m.length;i++){
			m[i][0]=false;
		}
		
		for(int i=0; i<m[0].length;i++){
			m[0][i]=true;
		}
		
		for(int i=1;i<m.length;i++){
			for(int j=1;j<m[0].length;j++){
				m[i][j]=m[i][j-1];
				if(i>=arr[j-1]){
					m[i][j]=m[i][j]||m[i-arr[j-1]][j-1];
//					System.out.println(i+"   "+j+"    "+m[i-arr[j-1]][j-1]+"   "+arr[j-1]);
				}
			}
		}
		return m;
	}
}
