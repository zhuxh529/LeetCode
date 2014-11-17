package ch15;
import java.awt.Point;
import java.util.*;

public class p15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> list=new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,5));
		list.add(new Point(6,7));
		list.add(new Point(8,10));
		list.add(new Point(12,16));



		System.out.println(interval(list, new Point(4,9)));
	}
	
	public static ArrayList<Point>  interval(ArrayList<Point> list, Point pt){
		ArrayList<Point> result=new ArrayList<Point>();
		int l=0,r=0;
		boolean reach=false;
		
		for(Point p: list){
			if(p.y<pt.x){
				l++;
				result.add(p);
			}
			else if(p.x>pt.y){
				result.add(p);
			}
			else{
				pt.x=Math.min(pt.x, p.x);
				pt.y=Math.max(p.y, pt.y);
			}
			
			
		}
		result.add(l, pt);
		
		return result;
	}

}
