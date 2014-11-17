package ch6;

import java.util.Arrays;

public class p6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,2,2,3,3,1,1,2,2,2};
		firstMissingPositive(arr);
	}
	
	public static void firstMissingPositive(int[] A) {
        if (A == null) {
            return;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length) {

                int tmp = A[A[i]-1];
                if (tmp == A[i]) {
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }
        
        System.out.println(Arrays.toString(A));

       
    }

}
