package PracticeQstns;

import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 20/03/18.
 */
public class QueueUsingStack {
    static Stack<Integer> st1 = new Stack<>();
    static int ans=0;

    static void stackToQueue(){

        enqueue(5);
        enqueue(10);
        enqueue(2);
        System.out.println(dequeue());
        System.out.println(dequeue());

    }
    static int dequeue(){
        if(st1.isEmpty()) return -1;
        recurse();
        return ans;
    }

    static void recurse(){

        if(st1.size() == 1){
            ans =st1.pop();
           return;
        }
        int curVal = st1.pop();
        recurse();
        st1.push(curVal);

    }
    static void enqueue(int x){
        st1.push(x);
    }
    static boolean isEmpty(){
        if(st1.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args){
        stackToQueue();
    }
}
