package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;


public class p5_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		inOrder(root);
	}
	
	public static void inOrder(Node root){
		Stack<Node> s=new Stack<Node>();
		ArrayList<Comparable> result=new ArrayList<Comparable>();
		
		s.push(root);
		Node cur=root;
		while(!s.empty()){
			if(cur!=null){
				s.push(cur);
				cur=cur.left;
			}
			else{
				cur=s.pop();
				result.add(cur.data);
				cur=cur.right;
			}
			
			
			
			
		}
		

		for(Comparable c: result){
			System.out.print(c+",");
		}
		
		
	}

}
