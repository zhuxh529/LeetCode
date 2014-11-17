package chap7;

public class p7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,5,6};
		search(arr, 0);

	}
	
	public static void search(int[] arr, int v){
		int l=0, r=arr.length-1;
		int mid;
		int idx=-1;
		while(l<=r){
			mid=(l+r)/2;
			if(arr[mid]==v){
				idx=mid;
				break;
			}
			else if(arr[mid]<v){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
		}
		idx=idx!=-1?idx:l;
		System.out.println(idx);
	}

}
