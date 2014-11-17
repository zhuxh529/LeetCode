package chap2;

public class p2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int[] arr={4,5,6,6,6,7,7,0,1,2};
//		int[] arr={1,2,3,1,1,1,1,1,1,1};
		int tar=0;
		System.out.println(method1(arr, tar));
		System.out.println(method2(arr, tar));

		
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
	
	
	public static int method2(int[] arr, int tar){
		int mid, l,r;
		l=0;
		r=arr.length-1;
		while(l<=r){
			mid=(l+r)/2;
//			System.out.println(mid);
			if(arr[mid]==tar) return mid;
			if(arr[mid]>=arr[l]){
				if(arr[mid]>tar && tar>=arr[l]){
					r=mid-1;
				}
				else{
					l=mid+1;
				}
			}
			else{
				if(arr[mid]<tar && tar<=arr[r]){
					l=mid+1;
				}
				else{
					r=mid-1;
				}
				
			}
		}
		return -1;
		
	}
	
}
