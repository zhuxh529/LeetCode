package ch5;
import bst.*;
public class p5_3_3 {
	public static Comparable prev=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=BTreePrinterTest.test1();
		BTreePrinter.printNode(root);
		System.out.println(range(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}
	
	public static boolean inOrder(Node n){
		if(n==null) return true;
		boolean l=inOrder(n.left);
		if(l==false) return false;
		
		if(prev.compareTo(n.data)>0){
			return false;
		}
		
		prev=n.data;
		return inOrder(n.right);
		
	}
	
	public static boolean range(Node n, Comparable l, Comparable r){
		if(n==null) return true;
		return n.data.compareTo(l)>0 && n.data.compareTo(r)<0 && range(n.left, l, n.data) && 
				range(n.right, n.data, r);
		
	}
	

}
