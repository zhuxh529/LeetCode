package ch15;

public class p15_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply("12","10"));
	}
	
	public static String multiply(String a, String b){
		int[] arr=new int[a.length()+b.length()];
		int i,j, p, c;
		for(i=a.length()-1;i>=0;i--){
			c=0;
			for(j=b.length()-1;j>=0;j--){
				p=(a.charAt(i)-'0')*(b.charAt(j)-'0')+c+arr[i+j+1];
				arr[i+j+1]=p%10;
				c=p/10;
			}
			arr[i+j+1]+=c;
		}
		i=0;
		while(i<arr.length && arr[i]==0){
			i++;
		}
		String result="";
		while(i<arr.length){
			result+=""+arr[i++];
		}
		return result;
	}

}
