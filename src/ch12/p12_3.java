package ch12;

public class p12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr={1,2,4,3,0,9,7,8,6,3};
		int[] arr={1,3,1,4,5};

		maxProfit(arr);

	}
	
	public static void maxProfit(int[] arr){
		
		int maxIdx=0, max=0, minIdx=0, min=Integer.MAX_VALUE ;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				minIdx=i;
			}
			int diff=arr[i]-min;
			if(diff>max){
				max=diff;
				maxIdx=i;
			}
		}
		System.out.println("profit is:"+(max-min)+", "+maxIdx+", "+minIdx );
	}

}
