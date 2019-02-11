package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LexicalOrderNumber {
    static List<Integer> result = new ArrayList<>();
    public static List<Integer> lexicalOrder(int n) {
        if(n<1) return result;
        for(int i=1;i<=9;i++){
            DFS(i,n);
        }
        return result;

    }
    public static void DFS(int num,int n){
        if(num>n)return;
        result.add(num);
        num = num*10;
        for(int i=0;i<=9;i++){
            DFS(num+i,n);
        }
    }
    public static void main(String[] args){
        System.out.println(lexicalOrder(100).toString());
    }
}
