package ch11;

public class p11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sol is: "+sqrt(8));
	}
	
	 public static int sqrt(int x) {
	        long lo = 0;
	        long hi = x;

	        while (hi >= lo) {     
	            long mid = lo+(hi-lo)/2;
	            if (x < mid * mid) {
	                hi = mid-1;      // not hi = mid
	            } else {
	                lo = mid+1;  
	            }
	        }
	        return (int) hi;
	    } 
}
