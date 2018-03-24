package PracticeQstns;

import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 20/03/18.
 */
public class QueueUsingTwoStacks {
    static  Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    static void stackToQueue(){

        enqueue(5);
        enqueue(10);
        enqueue(2);
        System.out.println(dequeue());

    }

    static void enqueue(int x){
        st1.push(x);
    }

    static int dequeue(){
        if(st1.isEmpty()) return -1;
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    static boolean isEmpty(){
        if(st1.isEmpty() && st2.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args){
        stackToQueue();
    }
}
