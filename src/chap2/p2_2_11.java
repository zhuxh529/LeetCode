package chap2;
import linkedList.node;

public class p2_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4};
		int[] arr2={5,6,7,8};
		node l1=build(arr);
	
//		l1.print();
		System.out.println(cycle(l1));
//		node l2=swap(l1);
//		l2.print();
	}
	
	public static node build(int[] arr){
		node dum=new node(-1);
		node cur=dum;
		node he=null;
		for(int e: arr){
			
			cur.next=new node(e);
			cur=cur.next;
			if(e==4){
				he=cur;
			}
		}
		
//		cur.next=he;
		return dum.next;
		
	}
	
	public static boolean cycle(node head){
		node a=head,b=head.next;
		while(b!=null && b.next!=null){
			if(a==b) return true;
			a=a.next;
			b=b.next.next;
		}
		return false;
		
		
	}

}
