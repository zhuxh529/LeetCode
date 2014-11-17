package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;


public class p5_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1=BTreePrinterTest.test4();
		BTreePrinter.printNode(root1);
		System.out.println(symmetric(root1.left, root1.right));

	}
	
	
	public static boolean symmetric(Node a, Node b){
		if(a==null && b==null) return true;
		else if(a==null) return false;
		else if(b==null) return false;
		
		return a.data.compareTo(b.data)==0 && symmetric(a.left, b.right) && symmetric(a.right, b.left);
 
	}

}
