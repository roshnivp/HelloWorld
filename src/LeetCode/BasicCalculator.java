package LeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BasicCalculator {

    int i=0;

    public int calculate(String s) {
        if(s.length()==0)return 0;
        Set<Character> operation = new HashSet<>();

        operation.add('+');
        operation.add('-');
        operation.add('*');
        operation.add('/');

        Stack<Integer> st = new Stack<>();
        int num = getNumber(s);
        st.push(num);

        while(i<s.length()){
            char op = s.charAt(i);
            if(operation.contains(op)){
                if(op=='+'){
                    st.push(getNumber(s));
                }
                else if(op=='-'){
                    st.push(-getNumber(s));
                }
                else if(op=='*'){
                    st.push((st.pop())*getNumber(s));
                }
                else if(op=='/'){
                    st.push((st.pop())/getNumber(s));
                }
            }
            else{
                i++;
            }
        }

        int result=0;

        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;

    }

    public int getNumber(String s){
        int num=0;
        while(i<s.length() && s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))){
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            i++;
        }
        return num;

    }

    public static void main(String[] args){
        BasicCalculator bc =new BasicCalculator();
        System.out.println(bc.calculate(" 3/2 "));
    }
}

