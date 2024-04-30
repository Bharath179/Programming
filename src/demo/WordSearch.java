package demo;

public class WordSearch {
public static void main(String[] args) {
	char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
	String word="ABCB";
	System.out.println(exist(board,word));
}
public static boolean exist(char[][] board, String word) {
	char[] cWord=word.toCharArray();
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			if(cWord[0]==board[i][j]) {
				
				boolean[][] visited=new boolean[board.length][board[0].length];
				if(dfs(board,cWord,i,j,visited,0)) {
					return true;
				}
			}
		}
	}
	return false;
}
public static boolean dfs(char[][] board, char[] cWord, int i, int j, boolean[][] visited, int index) {
	if(index==cWord.length) {
		return true;
	}
	if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]==true) {
	return false;
	}
	if(board[i][j]!=cWord[index]) {
		return false;
	}
	visited[i][j]=true;
	if(dfs(board,cWord,i-1,j,visited,index+1)||dfs(board,cWord,i+1,j,visited,index+1)||dfs(board,cWord,i,j-1,visited,index+1)||
			dfs(board,cWord,i,j+1,visited,index+1)) {
	return true;
	}
visited[i][j]=false;
return false;
}
}
