package ch5;
import java.util.Stack;
import java.util.ArrayList;

import bst.*;

public class p5_1_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test3();
		BTreePrinter.printNode(root);
		populate(root);
		BTreePrinter.printNode(root);

		
	}
	
	public static void populate(Node n){
		Node cur=n;
		Node next, prev;
		while(cur!=null){
			next=null;
			prev=null;
			while(cur!=null){
				if(next==null){
					next=cur.left!=null?cur.left:cur.right;
				}
				if(cur.left!=null){
					if(prev!=null) prev.next=cur.left;
					prev=cur.left;
				}
				if(cur.right!=null){
					if(prev!=null) prev.next=cur.right;
					prev=cur.right;
				}

				cur=cur.next;
			}
			cur=next;
			
		}
	}
	

}
