package chap2;
import linkedList.doubleNode;
import java.util.HashMap;
import java.util.HashMap;


public class LRU {
	public doubleNode head;
	public doubleNode tail;
	public int size;
	public int maxSize=5;
	public HashMap<Integer, doubleNode> map; 
	
	public LRU(){
		this.size=0;
		map =new HashMap<Integer, doubleNode>();
	}

	public void add(int v){
		if(map.get(v)!=null){
			doubleNode cur=map.get(v);
			if(cur.value==head.value) return;
			if(cur.value==tail.value){
				tail.prev.next=null;
				tail=tail.prev;
			}
			else{
				cur.prev.next=cur.next;
				cur.next.prev=cur.prev;
			}
			cur.next=head;
			head.prev=cur;
			
			cur.prev=null;
			head=cur;
			return;
		}
		
		
		if(size==0){
			head=new doubleNode(v);
			tail=head;
			map.put(v, head);
			size++;
		}
		else if(size==maxSize){
			map.remove(tail.value);
			tail=tail.prev;
			tail.next=null;
//			System.out.println(tail.value+" "+tail.next);
			doubleNode cur=new doubleNode(v);
			cur.next=head;
			head.prev=cur;
			head=cur;
			map.put(v, cur);
		}
		else{
			doubleNode cur=new doubleNode(v);
			cur.next=head;
			head.prev=cur;
			head=cur;
			map.put(v, cur);
			size++;
		}
	}
	
	public int get(int v){
		int ret;
		if(map.get(v)!=null) {
			ret= 1;
			doubleNode cur=map.get(v);
			if(cur.value==head.value) return 1;
			if(cur.value==tail.value){
				tail.prev.next=null;
				tail=tail.prev;
			}
			else{
				cur.prev.next=cur.next;
				cur.next.prev=cur.prev;
			}
			cur.next=head;
			head.prev=cur;
			
			cur.prev=null;
			head=cur;
		}
		else ret= -1;
		
		
		
		return ret;
		
	}
	
}
