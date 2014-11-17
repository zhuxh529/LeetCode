package ch5;

import java.util.Stack;
import java.util.ArrayList;

import bst.*;


public class P5_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		ArrayList<ArrayList<Comparable>> list=new ArrayList<ArrayList<Comparable>>();
		lvlOrder(root, 0, list);
		for(ArrayList<Comparable> arr: list){
			System.out.println(arr);
		}
	}
	
	public static void lvlOrder(Node cur, int lvl, ArrayList<ArrayList<Comparable>> list){
		if(cur==null) return;
		if(lvl==list.size()){
			ArrayList<Comparable> arr=new ArrayList<Comparable>();
			list.add(arr);
		}
		ArrayList<Comparable> a=list.get(lvl);
		a.add(cur.data);
		lvlOrder(cur.left, lvl+1, list);
		lvlOrder(cur.right, lvl+1, list);

		
		
	}

}
