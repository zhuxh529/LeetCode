package chap2;

public class p2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,2,3,2,1,0,1};
		System.out.println(candy(arr));
	}
	
	public static int candy(int[] arr){
		int[] can=new int[arr.length];
		for(int i=1, inc=1;i<arr.length;i++){
			if(arr[i]>arr[i-1]) can[i]=Math.max(can[i], inc++);
			else{
				inc=1;
			}
		}
		
		for(int i=arr.length-2, inc=1;i>=0;i--){
			if(arr[i]>arr[i+1]) can[i]=Math.max(can[i], inc++);
			else{
				inc=1;
			}
		}
		int sum=0;
		for(int e:can){
			sum+=e+1;
		}
		return sum;
		
		
	}

}
