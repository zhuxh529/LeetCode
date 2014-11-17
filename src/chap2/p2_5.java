package chap2;

public class p2_5 {
	public static void main(String[] args) {
		int[] a={1,3};
		int[] b={2,4,6,8,10};
		System.out.println(method2(a,b));
	}
	
	public static int method1(){
		int[] a={1,3,5};
		int[] b={2,4,6,8,10};
		
		int la=a.length, lb=b.length;
		int k=2;
		int result=recurse1(a, 0, la, b, 0, lb, k);
		
		return result;
	}
	
	public static int recurse1(int[] a, int la1, int la2, int[] b, int lb1, int lb2, int k){
		int la=la2-la1;
		int lb=lb2-lb1;
		if(k==1) return Math.min(a[la1], b[lb1]);

		if(la>lb){
			return recurse1(b, lb1, lb2, a, la1, la2, k);
		}
		if(la==0) return b[k-1];
		
		int ia=Math.min(la, k/2), ib=k-ia;
		
		if(a[la1+ia-1]==b[lb1+ib-1]){
			return a[la1+ia-1];
		}
		
		if(a[la1+ia-1]<b[lb1+ib-1]){
			return recurse1(a,la1+ia, la2, b, lb1, lb2, k-ia);
		}
		else{
			return recurse1(a,la1, la2, b, lb1+ib, lb2, k-ib);
		}
		
		
	}
	
	public static double method2(int[] a, int[] b){
		int len=a.length+b.length;
		int k=len/2;
		double result=0;
		if(len%2==1){
			result=recurse2(a,0,b,0,k);
		}
		else{
			double x,y;
			x=recurse2(a,0,b,0,k);
			y=recurse2(a,0,b,0,k-1);
			result=(x+y)/2.0;
//			System.out.println(x+"  "+y+"  "+result);

		}
		
		return result;
		
	}
	
	public static double recurse2(int[] a, int la, int[] b, int lb, int k){
		if(la>=a.length) return (double)(b[lb+k]);
		if(lb>=b.length) return (double)(a[lb+k]);
		if(k==1){
			return (double)(a[la]>b[lb]?a[la]:b[lb]);
		}
		
		int akey=la+k/2>=a.length?Integer.MAX_VALUE:a[la+k/2];
		int bkey=lb+k/2>=b.length?Integer.MAX_VALUE:b[lb+k/2];
		if(akey>bkey){
			return recurse2(a,la, b, lb+k/2, k-k/2);
		}
		else{
			return recurse2(a,la+k/2, b, lb, k-k/2);
		}

		
		
		
	}

	
}
