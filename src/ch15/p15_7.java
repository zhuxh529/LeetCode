package ch15;
import java.util.*;


public class p15_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="barfoothefoobarman";
		String[] L={"bar", "foo"};
		ArrayList<Integer> arr=method(S,L);
		System.out.println(arr);
	}
	
	public static ArrayList<Integer> method(String S, String[] L){
		ArrayList<Integer> result=new ArrayList<Integer>();
		HashMap<String, Integer> mapL=new HashMap<String, Integer>();
		HashMap<String, Integer> mapS=new HashMap<String, Integer>();

		int m=L[0].length();
		int n=L.length;
		for(String e: L){
			if(mapL.get(e)==null){
				mapL.put(e, 1);
			}
			else{
				mapL.put(e, mapL.get(e)+1);
			}
		}
		
		int count=0;
		for(int i=0;i<S.length()-m*n;i++){
			mapS.clear();
			count=0;
			for(int j=0;j<m*n;j+=m){
				String tmp=S.substring(i+j, i+j+m);
				if(mapL.get(tmp)==null) break;
				
				if(mapS.get(tmp)==null){
					mapS.put(tmp, 1);
				}
				else{
					mapS.put(tmp, mapS.get(tmp)+1);
				}
				if(mapS.get(tmp)>mapL.get(tmp)) break;
				count++;
			}
			if(count==n) result.add(i);
		}
		
		
		
		
		
		return result;
	}

}
