package ch5;
import bst.*;

public class p5_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		System.out.println(isSum(root, 14));
	}

	public static boolean isSum(Node n, int sum){
		if(n==null) return false;
		
		if(n.left==null && n.right==null){
			return (Integer)n.data==sum;
		}
		return isSum(n.left, sum-(Integer)n.data) || isSum(n.right, sum-(Integer)n.data);
	}
}
