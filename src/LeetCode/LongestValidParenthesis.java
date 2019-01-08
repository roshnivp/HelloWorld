package LeetCode;

import java.util.Stack;

public class LongestValidParenthesis {
//    public static int longestValidParentheses(String s) {
//        int n = s.length();
//        if(n <=1) return 0;
//        Stack<Integer> stack = new Stack<Integer>();
//        int max = 0;
//        for(int i = 0; i< n; i++){
//            if(s.charAt(i) == ')' &&
//                    !stack.empty() && s.charAt(stack.peek()) == '('){
//                stack.pop();
//                if(stack.empty()){
//                    max = Math.max(max, i+1);
//                } else {
//                    max = Math.max(max, i - stack.peek());
//                }
//            } else {
//                stack.push(i);
//            }
//        }
//        return max;
//    }
    public static int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int result = 0;
        int leftCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            } else if (leftCount > 0){
                dp[i] = dp[i - 1] + 2;
                dp[i] += (i - dp[i]) >= 0 ? dp[i - dp[i]] : 0;
                result = Math.max(result, dp[i]);
                leftCount--;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.print(longestValidParentheses("()(()"));
    }
}
