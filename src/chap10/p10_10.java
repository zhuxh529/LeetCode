package chap10;

import java.util.Arrays;

public class p10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = 
				{{'.','.','9','7','4','8','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','.','.'}};
		System.out.println(solve(board));
		solve2(board);
	
	}
	
	public static boolean solve(char[][] board){
		for(int i=0; i<9;i++){
			for(int j=0; j<9;j++){
				if(board[i][j]=='.'){
					for(char k='1';k<='9';k++){
						board[i][j]=k;
						if(valid(board, i, j)&& solve(board)){
							return true;
						}
						board[i][j]='.';
					}
					return false;
				}
			}
		}
		System.out.println(Arrays.deepToString(board));
		return true;
	}
	
	public static void solve2(char[][] board){
		int count=0;
		for(int i=0; i<9;i++){
			for(int j=0; j<9;j++){
				if(board[i][j]=='.'){
					count++;
					for(char k='1';k<='9';k++){
						board[i][j]=k;
						if(valid(board, i, j)){
							solve(board);
						}
						board[i][j]='.';
					}
				}
			}
		}
		if(count==0)
		System.out.println(Arrays.deepToString(board));
		return ;
	}

	public static boolean valid(char[][] board, int x, int y){
		for(int i=0;i<9;i++){
			if(board[x][i]==board[x][y] && i!=y) return false;
			if(board[i][y]==board[x][y] && i!=x) return false;
		}
		
		int xx=3*(x/3);
		int yy=3*(y/3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[xx+i][yy+j]==board[x][y] && xx+i!=x && y!=yy+j){
					return false;
				}
			}
		}
		
		
		return true;
		
	}
	
}
