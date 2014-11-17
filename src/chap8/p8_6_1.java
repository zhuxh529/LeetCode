package chap8;

import java.util.ArrayList;
import java.util.HashMap;

public class p8_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();

		HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
		combine(result, map, "", "23", 0);
		System.out.println(result.toString());

        
        
	}
	
	public static void combine(ArrayList<String> result, HashMap<Character, char[]> map,String path, String input, int idx){
		if(idx==input.length()){
			String x=path;
			result.add(x);
			return;
		}
		
		char[] set=map.get(input.charAt(idx));
		for(char c: set){
			path+=c;
			combine(result, map, path, input, idx+1);
			path=path.substring(0, path.length()-1);
		}
		
		
	}

}
