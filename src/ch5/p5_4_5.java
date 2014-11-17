package ch5;
import java.awt.Point;

import bst.*;

public class p5_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test6();
		BTreePrinter.printNode(root);
		Point result= recurse(root);
		System.out.println(result.y);
	}
	
	public static Point recurse(Node n){
		if(n==null){
			Point p=new Point(0,0);
			return p;
		}
		Point l=recurse(n.left);
		Point r=recurse(n.right);
		
		int single=Math.max(l.x, r.x);
		single=single>0?single:0;
		single+=(Integer)n.data;
		int max=Math.max(l.y, r.y);
		max=Math.max(max, l.x+r.x+(Integer)n.data);
		return new Point(single, max);
		
		
	}

}
