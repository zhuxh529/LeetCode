package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;

public class p5_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		postOrder(root);
	}
	
	public static void postOrder(Node root){
		Stack<Node> s=new Stack<Node>();
		ArrayList<Comparable> result=new ArrayList<Comparable>();
		
		s.push(root);
		Node cur=root;
//		while(!s.empty()){
//			cur=s.pop();
//			result.add(cur.data);
//			
//			if(cur.left!=null) s.push(cur.left);
//			if(cur.right!=null) s.push(cur.right);
//
//		}
//		
//		for(Comparable c: result){
//			System.out.print(c+",");
//		}
		
	}

}
