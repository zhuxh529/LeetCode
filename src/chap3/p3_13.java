package chap3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class p3_13 {
	public static void main(String[] args) {
		String[] str={"eat", "ate", "tea", "yes", "yse", "sye", "yy"};
		
		ArrayList<ArrayList> result=anagram(str);
//		System.out.println(result.size());
		
		
		for(ArrayList<String> list: result){
			for(String ele: list){
				System.out.print(ele+", ");
			}
			System.out.println();
		}

		
	}
	
	public static ArrayList anagram(String[] arr){
		HashMap<String, ArrayList<String>> map=new HashMap<String, ArrayList<String>>();
		for(String ele: arr){
			char[] tmp=ele.toCharArray();
			
			Arrays.sort(tmp);
			String key=String.valueOf(tmp);
//			System.out.println(key);
			if(map.get(key)!=null){
				ArrayList<String> l=map.get(key);
				l.add(ele);
			}
			else{
				ArrayList<String> l=new ArrayList<String>();
				l.add(key);
				map.put(key, l);

			}
		}
		
//		for(String mapKey: map.keySet()){
//			System.out.print(mapKey+", ");
//		}
		
		
		ArrayList<ArrayList> result=new ArrayList<ArrayList>();
		ArrayList<String> tmp=new ArrayList<String>();
		for(String mapKey: map.keySet()){
			if(map.get(mapKey).size()>1){
				tmp=new ArrayList<String>();
				for(String in:map.get(mapKey) ){
					tmp.add(in);
				}
				result.add(tmp);
			}
			
		}
		
		return result;
		
		
	}
	
}
