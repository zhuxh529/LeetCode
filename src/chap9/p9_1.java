package chap9;
import java.util.*;

public class p9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dict={"hot","dot","dog","lot","log"};
		ladder(dict, "hit","cog");
	}

	public static void ladder(String[] dict, String a, String b){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String e: dict){
			map.put(e, 0);
		}
		map.put(a, 0);
		
		int[] visit=new int[dict.length];
		Queue<String> q=new LinkedList<String>();
		q.add(a);
		int step=0;
		while(!q.isEmpty()){
			String tmp=q.poll();
			step=map.get(tmp);
			if(diff(tmp, b)==1) {
				step=map.get(tmp)+1;
				break;
			}
			for(int i=0;i <dict.length;i++){
				if(diff(tmp, dict[i])==1 && visit[i]==0){
					visit[i]=1;
					q.add(dict[i]);
					map.put(dict[i],step+1);
					
				}
			}
		}
		System.out.println(step+1);
		System.out.println(map.toString());
		
	}
	
	public static int diff(String a, String b){
		if(a.length()!=b.length()){
			System.out.println("wrong dude");
			return -1;
		}
		int dif=0;
		for(int i=0; i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				dif++;
			}
		}
		return dif;
		
	}
	
}
