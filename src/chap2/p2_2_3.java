package chap2;
import linkedList.node;


public class p2_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,3,2,5,2};
		node a=build(arr);
		node b=part1(a,3);
		b.print();

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
	
	public static node partition(node head, int v){
		node h1, h2, r1, r2, cur;
		h1=new node(-1);h2=new node(-1);
		r1=h1;r2=h2;
		cur=head;
		while(cur!=null){
			if(cur.v<v){
				r1.next=cur;
				r1=r1.next;
			}
			else{
				r2.next=cur;
				r2=r2.next;
			}
			cur=cur.next;
		}
		
		r1.next=h2.next;
		r2.next=null;
		return h1.next;
		
		
	}
	
	public static node part1(node head, int v){
		node dum1=new node(-1), dum2=new node(-1);
		node cur1=dum1, cur2=dum2;
		while(head!=null){
			if(head.v<v){
				cur1.next=head;
				cur1=cur1.next;
			}
			else{
				cur2.next=head;
				cur2=cur2.next;
			}
			head=head.next;
		}
		cur1.next=dum2.next;
		cur2.next=null;
		return dum1.next;
	}
	
	

}
