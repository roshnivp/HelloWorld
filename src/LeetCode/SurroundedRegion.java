package LeetCode;

public class SurroundedRegion {
    public void solve(char[][] board) {
        if(board.length==0) return;
        int m= board.length;
        int n= board[0].length;
        boolean[][] visited= new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i==0 || i==m-1)&& visited[i][j]==false && board[i][j]=='0' ){
                    dfs(board,i,j,visited);
                }
                else if((j==0 || j==n-1)&& visited[i][j]==false && board[i][j]=='0' ){
                    dfs(board,i,j,visited);
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println(visited[i][j]);
                if(visited[i][j]==false){
                    board[i][j]='X';

                }
            }
        }


    }

    public void dfs(char[][] board, int i, int j, boolean[][] visited){

        if(i<0 || j<0 || i>board.length-1 || j>board[0].length || board[i][j]=='X' || visited[i][j]==true ){
            return;
        }

        visited[i][j]=true;
        if(i<board.length-1) dfs(board,i+1,j,visited);
        if(i>0) dfs(board,i-1,j,visited);
        if(j<board[0].length-1)dfs(board,i,j+1,visited);
        if(j>0) dfs(board,i,j-1,visited);


    }
    public static void main(String[] args){
        //char[][] board = new char[][]{{'X','X','X','X'},{'X','0','0','X'},{'X','X','0','X'},{'X','0','X','X'}};
        char[][] board = new char[][]{{'0','0'},{'0','0'}};
        SurroundedRegion sr = new SurroundedRegion();
        sr.solve(board);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                System.out.println("after"+board[i][j]);
            }
        }

    }
}
