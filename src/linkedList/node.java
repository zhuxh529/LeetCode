package linkedList;

public class node {
	public int v;
	public node next;
	public node(int value){
		v=value;
		next=null;
	}
	public void print(){
		node x=this;
		while(x!=null){
			System.out.print(x.v+" ");
			x=x.next;
		}
	}
	
}
