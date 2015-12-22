package chap2;
import linkedList.node;

public class p2_2_2 {
	public static node x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		node l1=build(arr);
		l1.print();
		node sec=l1.next;
		l1.next=null;
		node l2=reverseNormal(sec);
		l2.next=l1;
		System.out.println();
		x.print();
		
	}
	
	public static node build(int[] arr){
		node dum=new node(-1);
		node cur=dum;
		for(int e: arr){
			cur.next=new node(e);
			cur=cur.next;
		}
		
		return dum.next;
		
	}
	
	public static node reverseAll(node head){
		node cur=head;
		node prev=null;
		node nxt=null;
		while(cur!=null){
			nxt=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nxt;
		}
		return prev;
	}
	
	public static node reverseN(node head, int n){
		node cur=head;
		node prev=null;
		node nxt=null;
		while(cur!=null && n>0){
			nxt=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nxt;
			n--;
		}
		head.next=cur;
		return prev;
	}
	
	public static node reverse(node n1, int n, int m){
		node cur=n1;
		while(n>1){
			cur=cur.next;
			n--;
		}
		
		node tmp=reverseN(cur.next, m);
		cur.next=tmp;
		
		return n1;
	}
	
	public static node reverse2(node n1, int l, int r){
		node dum=new node(-1);
		dum.next=n1;
		node cur=dum;
		int i=1;
		node prev=cur;
		while(i<l){
			prev=n1;
			cur=cur.next;
			i++;
		}
		node newh=reverseN2(cur.next,r-l);
		cur.next=newh;
		return dum.next;
		
	}
	
	public static node reverseN2(node n, int m){
		node dum=new node(-1);
		node cur=dum, prev=null, first=null;
		first=n;
		while(m-->=0){
			node tmp=n.next;
			n.next=prev;
			prev=n;
			n=tmp;
		}
		first.next=n;
		return prev;
		
	}
	
	public static node reverseNormal(node head){
		if(head.next==null) {x=head;return head;}
		node next=reverseNormal(head.next);
		next.next=head;
		return head;
	}
	
	
	
}
