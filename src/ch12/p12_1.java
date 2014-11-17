package ch12;

public class p12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,3,1,1,4};
		int[] arr1={3,2,2,0,1};
		System.out.println(jump(arr1));
	}
	
	public static boolean jump(int[] arr){
		int max=0;
		for(int i=0; i<=max;i++){
			max=Math.max(max, i+arr[i]);
			if(max>=arr.length-1) return true;
		}
		return false;
		
	}
	

}
