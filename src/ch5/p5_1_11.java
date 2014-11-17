package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;

public class p5_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test2();
		BTreePrinter.printNode(root);
		flat(root);
//		BTreePrinter.printNode(root);
		Node n=root;
		while(n!=null){
			System.out.print(n.data);
			if(n.left!=null) System.out.println("wrong");

			n=n.right;
		}
		
	}
	
	public static void flat(Node n){
		if(n==null) return;
		if(n.left==null) {flat(n.right);return;}
//		System.out.println(n.data);
		flat(n.left);
		Node r=n.right;
		flat(r);
		n.right=n.left;
		Node tmp=n.left;
		while(tmp!=null&&tmp.right!=null) tmp=tmp.right;
		tmp.right=r;
		n.left=null;
		flat(r);
//		BTreePrinter.printNode(n);
		
	}

}
