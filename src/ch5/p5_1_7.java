package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;
public class p5_1_7 {
	static Node a,b,c;
	static Comparable prev=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test4();
		BTreePrinter.printNode(root);
		b=root;
		inorder(root);
		System.out.println((a==null)+"   "+(b==null));
		System.out.println(a.data+"  "+b.data);
		swap(a,b);
		BTreePrinter.printNode(root);
//		System.out.println(a.data);

	}
	
	public static void inorder(Node cur){
		if(cur==null) return;
		inorder(cur.left);
		if(prev.compareTo(cur.data)>0) {
			if(a!=null) b=cur;
			else {a=c;}
//			System.out.println("here");
		}
		prev=cur.data;
		c=cur;
		inorder(cur.right);
		
	}
	
	public static void swap(Node a, Node b){
		Comparable tmp=a.data;
		a.data=b.data;
		b.data=tmp;
	}

}
