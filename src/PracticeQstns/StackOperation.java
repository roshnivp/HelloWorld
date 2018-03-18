package PracticeQstns; /**
 * Created by Roshni Velluva Puthanidam on 7/1/16.
 */

import java.util.Stack;

public class StackOperation {

    public int Solution(String s) {


        Stack<Integer> st = new Stack<>();
        //int d= Integer.parseInt(s);
        String[] arr1 = s.split(" ");
        //System.out.println(s);
        for (int i = 0; i < arr1.length; i++){

            if(isInteger(arr1[i])){
                st.push(Integer.parseInt(arr1[i]));

            } else if (arr1[i].equalsIgnoreCase("pop")) {
                st.pop();
            } else if (arr1[i].equalsIgnoreCase("dup")) {
                int y = st.peek();
                st.push(y);
            } else if (arr1[i].equalsIgnoreCase("+")) {
                int y = st.peek();
                st.pop();
                int z = st.peek();
                st.push(y + z);
            } else if (arr1[i].equalsIgnoreCase("_")) {
                int y = st.peek();
                st.pop();
                int z = st.peek();
                st.push(z - y);
            }

        }
        return st.peek();

    }
    public boolean isInteger(String a ) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args){
        StackOperation ss=new StackOperation();
        String arr="13 15 17 20 40 10 pop dup 100 +  -";

        int x=ss.Solution(arr);

        System.out.println(x);

    }
}
