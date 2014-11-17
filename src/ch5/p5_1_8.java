package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;


public class p5_1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1=BTreePrinterTest.test4();
		Node root2=BTreePrinterTest.test3();
		root1.left.right=null;
		BTreePrinter.printNode(root1);
		System.out.println(same(root1, root2));

	}
	
	public static boolean same(Node a, Node b){
		if(a==null && b==null) return true;
		else if(a==null) return false;
		else if(b==null) return false;
		
		return a.data.compareTo(b.data)==0 && same(a.left, b.left) && same(a.right, b.right);
		
		
	}
	
}
