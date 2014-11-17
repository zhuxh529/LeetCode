package chap7;
import java.awt.Point;

public class p7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,1,2,4,4,4,4,5,6,6,7};
		bst(a, 4);
	}
	
	public static void bst(int[] arr,int value){

		int l=low(arr, value);
		int r=0;
		 r=high(arr, value);
		System.out.println(l+"  "+r);
		
	}
	
	public static int low(int[] arr, int value){
		int l=0, r=arr.length;
		while(l<r){
			int mid=(l+r)/2;
			if(arr[mid]>=value){
				r=mid;
			}
			else{
				l=mid+1;
			}
		}
		
//		System.out.println(l+" "+r);
		if(l>=arr.length) return -1;
		else return l;
		
	}
	
	public static int high(int[] arr, int value){
		int l=0, r=arr.length-1;
		while(l<r){
			int mid=(int)Math.ceil((double)((l+r)/2.0));
			if(arr[mid]<=value){
				l=mid;
			}
			else{
				r=mid-1;
			}
		}
		
//		System.out.println(l+" "+r);
		if(r>=arr.length) return -1;
		else return r;
		
	}

}
