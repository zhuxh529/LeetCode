package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;

public class p5_1_1 {
	public static void main(String[] args) {
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		preOrder(root);
		
	}
	
	public static void preOrder(Node n){
		ArrayList<Comparable> result=new ArrayList<Comparable>();
		Stack<Node> s=new Stack<Node>();
		s.push(n);
		Node cur;
		while(!s.empty()){
			cur=s.pop();
			result.add(cur.data);
			if(cur.right!=null) s.push(cur.right);
			if(cur.left!=null) s.push(cur.left);

		}
		
		for(Comparable c: result){
			System.out.print(c+",");
		}
		
		
	}

}
