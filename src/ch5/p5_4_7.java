package ch5;
import bst.*;

public class p5_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test3();
		BTreePrinter.printNode(root);
		int result=getSum(root,0);
		System.out.println(result);

	}
	
	public static int getSum(Node n, int sum){
		if(n==null) return 0;
		if(n.left==null && n.right==null){
			return (Integer)n.data+sum;
		}
		
		sum=(Integer)n.data+sum;
		return getSum(n.left, sum*10)+getSum(n.right, sum*10);
	}

}
