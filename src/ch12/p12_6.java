package ch12;

public class p12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,8,2,9,4,2};
		System.out.println(container(a));
	}

	public static int container(int[] arr){
		int l=0, r=arr.length-1;
		int area, result=0;
		while(l<r){
			area=(r-l)*Math.min(arr[l], arr[r]);
			result=Math.max(area, result);
			if(arr[l]>arr[r]){
				r--;
			}
			else{
				l++;
			}
		}
		return result;
	}
	
}
