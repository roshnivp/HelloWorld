package LeetCode;

import java.util.Stack;

public class BackSpaceComparison {
    public boolean backspaceCompare(String S, String T) {
        if(S.length()==0 || T.length()==0) return true;
        if(S.equals(T))return true;
        return buildString(S).equals(buildString(T));
    }

    public String buildString(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='#'){
                st.push(c);
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        return String.valueOf(st);
    }

    public static void main(String[] args){
        BackSpaceComparison b = new BackSpaceComparison();
        System.out.println(b.backspaceCompare("ab#cd#","acd#"));
    }
}
