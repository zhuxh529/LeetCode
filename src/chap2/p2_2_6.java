package chap2;
import linkedList.node;

public class p2_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated met	hod stub
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		node l1=build(arr);
		node l2=rotate2(l1, 3);
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
		while(b.next!=null){
			prev=a;
			a=a.next;
			b=b.next;
		}
		b.next=h;
		node head=a;
		prev.next=null;
		return head;
		
	}
	
	public static node rotate2(node h, int len){
		node tail=h;
		int total=0;
		while(tail.next!=null){
			total++;
			tail=tail.next;
		}
		node mid=h;
		while(total-len>0){
			total--;
			mid=mid.next;
		}
		node head=mid.next;
		mid.next=null;
		tail.next=h;
		return head;
		
	}

	

}
