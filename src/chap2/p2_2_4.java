package chap2;
import linkedList.node;

public class p2_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,2,2,3,3,3};
		node l1=build(arr);
		node l2=duplicate2(l1);
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
	
	public static node duplicate(node head){
		node cur=head;
		node prev=null;
		while(cur!=null){
			if(prev!=null && prev.v==cur.v){
				prev.next=cur.next;
			}
			else{
				prev=cur;
			}
			cur=cur.next;
		}
		
		return head;
	}
	
	public static node duplicate2(node h){
		node dum=new node(-1);
		node cur=dum, prev=dum;
		while(h!=null){
			if(h.v!=prev.v){
				prev.next=h;
				prev=h;
			}
			h=h.next;
		}
		prev.next=null;
		return dum.next;
	}

}
