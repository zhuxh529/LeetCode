package chap2;
import linkedList.node;

public class p2_2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		node l1=build(arr);
		node l2=swap(l1,3);
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
	
	public static node swap(node h){
		node dum=new node(-1);
		node cur=dum,a,b;
		while(h!=null){
			System.out.println(h.v);
			a=h;b=h.next;
			if(b==null) break;
			a.next=b.next;
			b.next=a;
			cur.next=b;
			cur=a;
			h=cur.next;
		}
		return dum.next;
	}
	
	public static node swap(node h, int k){
		node dum=new node(-1);
		if(h==null) return null;
		int kk=0;
		node cur=dum, prev=dum, a=h, b=h.next;
		dum.next=h;
		
		while(true){
			prev= reverse(prev, k);
			if(prev==null) break;
		}
		
		return dum.next;
	}
	
	public static node reverse(node prev, int k){
		node last=prev;
		int kk=k;
		if(k<=1) return prev.next;
		while(kk-->0){
			last=last.next;
			if(last==null) return null;

		}
		System.out.println(last.v+"   "+prev.v);
		node h=prev.next, 
				cur=h, 
				p=last.next;
		
		prev.next=last;
		kk=k;
		while(kk-->0){
			node tmp=cur.next;
			cur.next=p;
			p=cur;
			cur=tmp;
		}
		prev.next=last;
		return h;
		
	}

}
