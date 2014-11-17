package ch12;
import java.util.HashMap;
public class p12_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method("bbbbabedefff"));
	}
	
	public static int method(String a){
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int max=1;
		int start=0;
		for(int i=0;i<a.length();i++){
			char c=a.charAt(i);
			if(map.get(a.charAt(i))==null){
				map.put(c,i);
				max=Math.max(i-start+1, max);
			}
			else{
				start=start>map.get(c)+1?start:map.get(c)+1;
				max=Math.max(max, i-start);
				map.put(c, i);
			}
		}
		return max;
	}

}
