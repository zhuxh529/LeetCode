package chap9;
import java.util.*;


public class p9_2 {

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
		
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		ArrayList<String> path=new ArrayList<String>();
		path.add(a);
		reconstruct(map, 0, result, path, step);
		System.out.println(result.size());
		for(ArrayList<String> p: result){
			System.out.println(p.toString());
		}
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
	
	public static void reconstruct(HashMap<String, Integer> map, int step, 
			ArrayList<ArrayList<String>> result, ArrayList<String>path, int end){
		if(step==end-1){
//			System.out.println(path.toString());
			ArrayList<String> arr=new  ArrayList<String>(path);
			arr.add("cog");
			result.add(arr);
			return;
		}
			
		for(String e:map.keySet()){
			String prev=path.get(path.size()-1);
			if(map.get(e)==step+1 && diff(prev, e)==1){
				path.add(e);
				reconstruct(map, step+1, result, path, end);
				path.remove(path.size()-1);
			}
		}
		
		
	}

}
