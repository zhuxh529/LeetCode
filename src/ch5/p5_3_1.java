package ch5;

public class p5_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueBSTnum(3));
	}
	
	public static int uniqueBSTnum(int n){
		int[] arr=new int[n+1];
		arr[0]=1;
		arr[1]=1;
		for(int i=2; i<=n;i++){
			for(int j=0;j<i;j++){
				arr[i]+=arr[j]*arr[i-1-j];
			}
		}
		return arr[n];
	}

}
