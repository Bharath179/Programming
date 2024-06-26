package demo;

public class MinimunPathLength {
public static void main(String[] args) {
	int[][]grid = {{1,2,3},{4,5,6}};
	System.out.println(pathLength(grid));
}
public static int pathLength(int[][] grid) {
	int rows=grid.length;
	int cols=grid[0].length;
	int[][] dp=new int[rows][cols];
	for(int i=rows-1;i>=0;i--) {
		for(int j=cols-1;j>=0;j--) {
			if(i==rows-1 && j!=cols-1) {
				dp[i][j]=grid[i][j]+dp[i][j+1];
			}
			else if(j==cols-1 && i!=rows-1) {
				dp[i][j]=grid[i][j]+dp[i+1][j];
			}else if(i!=rows-1 && j!=cols-1) {
				dp[i][j]=grid[i][j]+Math.min(dp[i+1][j], dp[i][j+1]);
			}else
				dp[i][j]=grid[i][j];
		}
	}
	return dp[0][0];
}
}

