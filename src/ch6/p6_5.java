package ch6;

import java.util.Arrays;

public class p6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,8,-1,1};
		System.out.println(firstMissingPositive(arr));
	}
	
	public static int firstMissingPositive(int[] A) {
        if (A == null) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != (i+1)) {

                int tmp = A[A[i]-1];
                if (tmp == A[i]) {
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }
        
        System.out.println(Arrays.toString(A));

        for (int i = 0; i < A.length; i ++) {
                if (A[i] != i + 1) {
                    return i + 1;
                }
        }

        return A.length + 1;
    }

}
