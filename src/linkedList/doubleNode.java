package linkedList;

public class doubleNode {
	public  doubleNode prev=null;
	public  doubleNode next=null;
	public  int value;
	
	public doubleNode(int v){
		this.value=v;
	}
	
	public void print(){
		doubleNode cur=this;
		while(cur!=null){
			System.out.print(cur.value+", ");
			cur=cur.next;
		}
	}

}
