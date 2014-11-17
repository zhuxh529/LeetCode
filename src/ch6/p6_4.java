package ch6;
import linkedList.node;

public class p6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node n=createList1();
		n.print();
		System.out.println();
		node result=sort2(n);
		result.print();

	}
	
	public static node sort(node n){
		node head=n;
		node cur=n;
		node dum=new node(Integer.MIN_VALUE);
//		dum.next=cur;
//		cur=cur.next;
		while(cur!=null){
//			System.out.println(dum.next.v);
			node j=dum;
			while(j.next!=null && j.next.v<cur.v){
				j=j.next;
			}			
//			System.out.println(cur.v+"  "+j.next==null?"null":"");

			node tmp=cur.next;
			cur.next=j.next;
			j.next=cur;
			
			j.print();
			System.out.println(":::::::::::::");
			head.print();System.out.println();
			cur=tmp;
			dum.print();System.out.println();
//			cur.print();System.out.println();

		}
		return dum.next;
		
	}
	
	public static node sort2(node n){
		node dum=new node(-1);
		node j;
		
		while(n!=null){
			j=dum;
			while(j.next!=null && j.next.v< n.v){
				j=j.next;
			}
			node tmp=n.next;
			n.next=j.next;
			j.next=n;
			n=tmp;
			
		}
		
		return dum.next;
	}

	
	
	
	public static node createList1(){
		node cur, prev;
		node head=new node(5);
		cur=new node(19);
		head.next=cur;
		prev=cur;
		cur=new node(9);
		prev.next=cur;
		prev=cur;
		cur=new node(1);
		prev.next=cur;
		prev=cur;
		cur=new node(3);
		prev.next=cur;
		prev=cur;
		
		
		
		return head;
	}

}
