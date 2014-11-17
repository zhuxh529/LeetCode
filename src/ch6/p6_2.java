package ch6;
import linkedList.node;

public class p6_2 {
	public static void main(String[] args) {
		node a=createList1();
		node b=createList2();
//		a.print();
		node c=merge(a,b);
		c.print();
		
	
	}
	
	public static node merge(node a, node b){
		node ret, dum;
		dum=new node(-1);
		ret=dum;
		while(a!=null && b!=null){
			if(a.v<b.v){
				ret.next=a;
				a=a.next;
			}
			else{
				ret.next=b;
				b=b.next;
			}
			ret=ret.next;
		}
		if(a!=null){
			ret.next=a;
		}
		else{
			ret.next=b;
		}
		return dum.next;
	}
	


	public static node createList1(){
		node cur, prev;
		node head=new node(1);
		cur=new node(3);
		head.next=cur;
		prev=cur;
		cur=new node(5);
		prev.next=cur;
		prev=cur;
		cur=new node(7);
		prev.next=cur;
		prev=cur;
		cur=new node(9);
		prev.next=cur;
		prev=cur;
		
		
		
		return head;
	}


	public static node createList2(){
		node cur, prev;
		node head=new node(2);
		cur=new node(4);
		head.next=cur;
		prev=cur;
		cur=new node(6);
		prev.next=cur;
		prev=cur;
		cur=new node(8);
		prev.next=cur;
		prev=cur;
		cur=new node(10);
		prev.next=cur;
		prev=cur;
		
		
		return head;
	}
}
