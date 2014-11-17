package chap2;
import linkedList.node;

public class p2_2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4};
		int[] arr2={5,6,7};
		node l1=build(arr);
		node l2=build(arr2);
		node r=merge(l1,l2);
		r.print();
		
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
	
	public static node merge(node n1, node n2){
		node a=n1;
		node tmp1,tmp2, prev=null;
		while(n1!=null){
			tmp1=n1.next;
			if(n2==null){
				break;
			}
			n1.next=n2;
			n2=n2.next;
			n1.next.next=tmp1==null?n2:tmp1;
			n1=tmp1;
		}
		return a;
	}
	
	

}
