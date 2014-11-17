package chap2;

public class p2_4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,1,1,1,1,1,1,1};
		System.out.println(method1(arr, 3));
		
	}
	
		public static int method1(int[] arr, int tar){
			int mid, l,r;
			l=0;
			r=arr.length;
			while(l<r){
				mid=(l+r)/2;
				if(arr[mid]==tar) return mid;
				if(arr[mid]>arr[l]){
					if(tar<arr[mid] && tar>=arr[l]){
						r=mid;
					}
					else{
						l=mid+1;
					}
				}
				else if(arr[mid]<arr[l]){
					if(tar>arr[mid] && tar<arr[r-1]){
						l=mid+1;
					}
					else{
						r=mid;
					}
				}
				else{
					l++;
				}
			}
			return -1;	
		}
		
}
