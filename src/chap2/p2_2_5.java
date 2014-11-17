package chap2;

import linkedList.node;

public class p2_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,1,1,2,2,2,2,4,5,3,3,3};
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
		node dum=new node(-1);
		dum.next=head;
		node cur=dum;
		node prev=dum;
		int pre=-1;
		node fake=dum;
		
		while(cur.next!=null){
			if(cur.v!=cur.next.v){
				fake=cur.next;
				if(fake.next==null || fake.next.v!=fake.v){
					prev.next=fake;
					prev=fake;
					
				}
				pre=1;
			}
			else{
				pre=-1;
			}
			cur=cur.next;
		}
		
		if(pre==-1) prev.next=null;
		return dum.next;
	}

	public static node duplicate2(node h){
		node dum=new node(-1);
		node prev=dum, cur=dum;
		cur.next=h;
		int x=1;
		while(cur.next!=null){
			if(cur.v!=cur.next.v){
				node tmp=cur.next;
				if(tmp.next!=null && tmp.next.v!=tmp.v){
					prev.next=cur.next;
					prev=cur.next;
				}
				x=1;
			}
			else{
				x=-1;
			}
			cur=cur.next;
		}
		if(x==-1){
			prev.next=null;
		}
		return dum.next;
		
		
	}
	
}
