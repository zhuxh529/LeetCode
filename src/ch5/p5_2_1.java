package ch5;
import java.util.ArrayList;

import bst.*;

public class p5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre={7,10,4,3,1,2,8,11};
		int[] in={4,10,3,1,7,11,8,2};
		int len=pre.length;
		Node root=build(pre, in, 0,len-1, 0,len-1);
		BTreePrinter.printNode(root);


	}

	public static Node build(int[] pre, int[] in, int l1, int r1, int l2, int r2 ){
		if(l2>r2) return null;
		Node cur=new Node(pre[l1]);
		int pos=find(in, l2,r2, pre[l1]);
		cur.left=build(pre, in, l1+1, l1+pos-l2, l2, pos-1);
		cur.right=build(pre, in, pos-r2+r1+1, r1, pos+1, r2);
		
		return cur;
	}
	
	public static int find(int[] in, int l2, int r2, int v){
		for(int i=l2;i<=r2;i++){
			if(in[i]==v) return i;
		}
		
		return -1;
	}
	
}
