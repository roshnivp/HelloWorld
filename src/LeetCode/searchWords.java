package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class searchWords {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ls= new ArrayList<>();
        if( board.length==0) return ls;

        for(String word:words){
            if(searchWord(word,board)){
                ls.add(word);
            }
        }
        return ls;

    }

    public boolean searchWord(String word,char[][] board ){
        boolean find= false;
        for(int i=0; i<board.length && !find; i++){
            for(int j=0; j<board[0].length && !find; j++){
                if(word.charAt(0)==board[i][j]){
                    find= searchWord( board, word, i, j,0);
                }
            }
        }
        return find;
    }

    public boolean searchWord(char[][] board,String word, int i, int j,  int index){
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1) return false;
        if(word.charAt(index)!=board[i][j]) return false;
        if(index==word.length()-1) {
            return true;
        }

        char temp = board[i][j];
        board[i][j]=1;//visited
        boolean found= ( (i<board.length) && (searchWord(board,word,i+1,j,index+1)) || (i>0) && (searchWord(board,word,i-1,j,index+1)) || ( j<board[0].length) && (searchWord(board,word,i,j+1,index+1)) || ( j>0 ) && (searchWord(board,word,i,j-1,index+1)));
        board[i][j]=temp;
        return found;
    }
    public static void main(String[] args){
//        String[] words = new String[]{"oath","pea","eat","rain"};
//        char[][] board = new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = new String[]{"aaba"};
        char[][] board = new char[][]{{'a','b'},{'a','a'}};
        searchWords s = new searchWords();
        System.out.println(s.findWords(board,words).toString());

    }
}
