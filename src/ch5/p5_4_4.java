package ch5;
import bst.*;
import java.util.ArrayList;

public class p5_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		paths(root, 19, result,list);
		for(ArrayList ele: result){
			System.out.println(ele);
		}

	}
	
	public static void paths(Node n, Integer sum, ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list ){
		if(n==null) return;
		if(n.left==null && n.right==null){
			if(n.data.compareTo(sum)==0){
				ArrayList<Integer> l=new ArrayList<Integer>(list);
				l.add((Integer)n.data);
				result.add(l);
			}
		}
		list.add((Integer)n.data);
		paths(n.left, sum-(Integer)n.data, result,list);
		paths(n.right, sum-(Integer)n.data, result,list);
		list.remove(list.size()-1);
		
	}

}
