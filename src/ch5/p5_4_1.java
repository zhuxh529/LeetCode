package ch5;
import bst.*;

public class p5_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test4();
		BTreePrinter.printNode(root);
		System.out.println(minHeight(root));
	}
	
	public static int minHeight(Node n){
		if(n==null) return Integer.MAX_VALUE;
		if(n.left==null && n.right==null) return 1;
		return 1+Math.min(minHeight(n.left), minHeight(n.right));
	}

}
