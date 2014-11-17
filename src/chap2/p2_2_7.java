package chap2;
import linkedList.node;

public class p2_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated met	hod stub
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		node l1=build(arr);
		node l2=remove(l1, 3);
		l2.print();
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
	
	
	public static node rotate(node h, int len){
		node a=h;
		node b=h, prev=null;
		while(len--!=0) {b=b.next;}
		while(b!=null){
			prev=a;
			a=a.next;
			b=b.next;
		}
		prev.next=a.next;
		return h;
		
	}
	
	public static node remove(node n, int x){
		
		node dum=new node(-1);
		dum.next=n;
		node a=dum,b=dum;
//		x++;
		while(x>=0){
			x--;
			b=b.next;
		}
		while(b!=null){
			a=a.next;
			b=b.next;
		}
		
		a.next=a.next.next;
		return dum.next;
		
	}

}
