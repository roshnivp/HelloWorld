package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        if(asteroids==null || asteroids.length==0)return new int[0];
        Stack<Integer> st = new Stack<>();

        for(int num:asteroids){
            step1: {
                while(!st.isEmpty()&& num<0 && st.peek()>0){ //if both have same sign don't have to blow
                    if(Math.abs(num)>st.peek()){ // st.peek() blow away
                        st.pop();
                        continue;
                    }
                    else if(Math.abs(num)==st.peek()){ //both num,st.peek() blow
                        st.pop();
                        break step1;
                    }
                    else{
                        break step1;
                    }
                }

                st.push(num);
            }
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,4,-10,5})));
    }
}
