package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllParenthesis {
    static List<String> ans = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        if(n==0)return ans;
        getAllParenthesis("",0,0,n);
        return ans;
    }
    public static void getAllParenthesis(String current, int open, int close,int max){
        if(current.length()==(2*max)){
            ans.add(current);
            return;
        }
        if(open<max){
            getAllParenthesis(current+"(",open+1,close,max);
        }
        if(close<open){
            getAllParenthesis(current+")",open,close+1,max);
        }
    }
    public static void main(String[] args){
        System.out.println(generateParenthesis(2).toString());
    }
}
