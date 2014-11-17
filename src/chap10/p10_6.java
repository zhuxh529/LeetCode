package chap10;

public class p10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip="25525511135";
		String path="";
		getIP(path, ip, 0, 0);
	}
	
	public static void getIP(String path, String ip, int l, int step){
		if(step==4){
			if(l!=ip.length()){
				return;
			}
			
			path=path.substring(0, path.length()-1);
			System.out.println(path);
			return;
		}
		String cur="";
		for(int i=l+1; i<=ip.length();i++){
			if(i-l>3) break;
			cur=ip.substring(l, i);
			int x=Integer.parseInt(cur);
			if(x>0 &&x<=255){
				path+=cur+".";
				getIP(path, ip, i, step+1);
				path=path.substring(0, path.length()-cur.length()-1);
			}
		}
		
	}

}
