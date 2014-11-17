package test;
import chap2.LRU;

public class testLRU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU c=new LRU();
		c.add(4);
		c.add(3);
		c.add(2);
		c.add(1);
		c.add(5);
		c.add(7);
		c.add(8);
		c.add(5);
		c.add(2);
		System.out.println(c.get(5));
		c.head.print();
	}

}
