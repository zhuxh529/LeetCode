package ch6;
import linkedList.node;

import java.util.ArrayList;
import java.util.Arrays;

public class p6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<node> arr=new ArrayList<node>();
		arr.add(createList1());
		arr.add(createList2());
		arr.add(createList3());
		arr.add(createList4());
		node cur=merge(arr);
		cur.print();
		
	}
	
	
	
	public static node merge(ArrayList<node> arr){
		boolean[] end = new boolean[arr.size()];
		node dum=new node(-1);
		node cur=dum;
		int dones=0;
		while(dones<4){
			node min=new node(Integer.MAX_VALUE);
			int minIdx=0;
			node tmp;
			for(int i=0; i<arr.size();i++){
				if(end[i]==true) continue;
				tmp=arr.get(i);
				if(tmp.v<min.v){
					minIdx=i;
					min=tmp;
				}
				
			}
			cur.next=min;
			cur=cur.next;
			arr.set(minIdx, min.next);
//			arr.get(i)=arr.get(i).next;
			min=min.next;
			if(min==null){
				end[minIdx]=true;
				dones++;
			}
//			System.out.println(min.v);
		}
		
		
		
		
		return dum.next;
	}
	
	
	public static node createList1(){
		node cur, prev;
		node head=new node(1);
		cur=new node(5);
		head.next=cur;
		prev=cur;
		cur=new node(9);
		prev.next=cur;
		prev=cur;
		cur=new node(15);
		prev.next=cur;
		prev=cur;
		cur=new node(21);
		prev.next=cur;
		prev=cur;
		
		
		
		return head;
	}


	public static node createList2(){
		node cur, prev;
		node head=new node(3);
		cur=new node(7);
		head.next=cur;
		prev=cur;
		cur=new node(11);
		prev.next=cur;
		prev=cur;
		cur=new node(12);
		prev.next=cur;
		prev=cur;
		cur=new node(19);
		prev.next=cur;
		prev=cur;
		
		
		return head;
	}
	
	
	public static node createList3(){
		node cur, prev;
		node head=new node(2);
		cur=new node(4);
		head.next=cur;
		prev=cur;
		cur=new node(13);
		prev.next=cur;
		prev=cur;
		cur=new node(16);
		prev.next=cur;
		prev=cur;
		cur=new node(18);
		prev.next=cur;
		prev=cur;
		
		
		return head;
	}
	
	public static node createList4(){
		node cur, prev;
		node head=new node(-1);
		cur=new node(20);
		head.next=cur;
		prev=cur;
		cur=new node(101);
		prev.next=cur;
		prev=cur;
		cur=new node(120);
		prev.next=cur;
		prev=cur;

		
		
		return head;
	}

}
