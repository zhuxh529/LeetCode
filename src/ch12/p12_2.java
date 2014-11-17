package ch12;

public class p12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,8,1,1,4,1,2,3,4};
		int[] arr1={3,2,2,0,1};
		System.out.println(jump(arr,0,0,""));
	}
	
	public static int jump(int[] arr, int idx, int step, String path){
		if(idx>=arr.length-1){
			System.out.println(path);
			return step;
		}
		int min=Integer.MAX_VALUE;
		
		for(int i=idx+1;i<=arr[idx]+idx;i++){
//			System.out.println(i);
			String a=path;
			path+=arr[idx];
			min=Math.min(min, jump(arr,i,step+1, path));
			path=a;
		}
		
		return min;
	}
	
}
