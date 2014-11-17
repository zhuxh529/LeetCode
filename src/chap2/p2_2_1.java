package chap2;
import linkedList.node;

public class p2_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={2,4,6};
		int[] a2={5,6,4};
		node a=construct(a1);
		node b=construct(a2);
		node c=add2(a,b);
		c.print();
	}
	
	public static node construct(int[] arr){
		node dum=new node(-1);
		node cur=dum;
		for(int e: arr){
			cur.next=new node(e);
			cur=cur.next;
		}
		return dum.next;
		
	}
	
	public static node add(node a, node b){
		int c=0;
		node head=new node(-1), cur=head;
		int aa,bb,cc;
		while(a!=null || b!=null){
			if(a==null){
				aa=0;
			}
			else{
				aa=a.v;
				a=a.next;
			}
			if(b==null){
				bb=0;
			}
			else{
				bb=b.v;
				b=b.next;
			}
			cc=aa+bb+c;
			c=cc/10;
			cur.next=new node(cc%10);
			cur=cur.next;
			
		}
		if(c>0){
			cur.next=new node(c);
		}
		
		return head.next;
	}
	
	
	public static node add2(node a, node b){
		node dum=new node(-1);
		node cur=dum;
		int c=0;
		while(a!=null || b!=null){
			int aa=0,bb=0;
			if(a==null) {aa=0;bb=b.v;b=b.next;}
			else if(b==null) {bb=0;aa=a.v;a=a.next;}
			else{
				bb=b.v;b=b.next;
				aa=a.v;a=a.next;
//				System.out.println(bb+"  "+aa);
			}
			int sum=aa+bb+c;
			c=sum/10;
			cur.next=new node(sum%10);
			cur=cur.next;
		}
		if(c!=0) cur.next=new node (c);
		return dum.next;
	}

}
