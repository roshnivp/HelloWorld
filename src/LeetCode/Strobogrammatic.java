package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Strobogrammatic {//number looks same upside down

    HashMap<Character,Character> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    public List<String> findStrobogrammatic(int n) {

        if(n==0)return result;
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');

        char[] tmp_str = new char[n];
        dfs(0,n,tmp_str);
        return result;

    }

    public void dfs(int index,int n,char[] tmp_str){

        if(index==(n+1)/2){
            result.add(new String(tmp_str));
            return;
        }

        for(char c:map.keySet()){
            if(index==0 && n>1 && c=='0')continue;//first element can not be 0
            if(index==n/2 && (c=='6' || c=='9'))continue;//mid element can not be 6 or 9

            tmp_str[index]=c;
            tmp_str[n-1-index]=map.get(c);
            dfs(index+1,n,tmp_str);
        }

    }

    public static void main(String[] args){
        Strobogrammatic s = new Strobogrammatic();
        System.out.println(s.findStrobogrammatic(3).toString());
    }
}
