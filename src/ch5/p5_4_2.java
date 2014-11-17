package ch5;
import bst.*;

public class p5_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test3();
		BTreePrinter.printNode(root);
		System.out.println(maxHeight(root));

	}
	
	public static int maxHeight(Node n){
		if(n==null) return Integer.MIN_VALUE;
		if(n.left==null && n.right==null) return 1;
		return 1+Math.max(maxHeight(n.left),maxHeight(n.right));
	}
	
}
