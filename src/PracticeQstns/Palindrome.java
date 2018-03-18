package PracticeQstns;
/**
 * Created by roshni on 6/15/16.
 */
import java.util.*;
public class Palindrome {

    private static class Node{
        Character item;
        Node next;
    }
    private Node top;
    public void push(Character N)
    {
        Node nextTop;
        nextTop=new Node();
        nextTop.item=N;
        nextTop.next=top;
        top=nextTop;
    }
    public Character pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        Character topItem=top.item;
        top=top.next;
        return topItem;
    }
    public Character  peek(double d)
    {
        return top.item;
    }
    public boolean isEmpty(){
        return (top == null);
    }
    public static void main(String[] args){
        String input="TACOCAT";
        Palindrome p=new Palindrome();
        for(int i=0;i<input.length();i++){
            p.push(input.charAt(i));
        }
        String reverse="";
        while (!p.isEmpty()){
        reverse+=p.pop();
        }
        if(input.equals(reverse)){
            System.out.println("It's a Palindrome");
        }
        else {
            System.out.println("It's not a Palindrome");
        }
    }
}
