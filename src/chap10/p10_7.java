package chap10;

public class p10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,6,7,8,4};
		combine("", a, 9,0);

	}
	
	public static int combine(String path, int[] arr, int sum, int l){
		if(sum==0){
			System.out.println(path);
			return 1;
		}
		if(sum<0) return 0;
		
		int xx=0;
		for(int i=l;i<arr.length;i++){
			int e=arr[i];
			if(sum<e) continue;
			String a=path;
			path+=""+e;
			xx+=combine(path, arr, sum-e, i);
			path=a;
		}
		
		return xx;
		
	}

}
