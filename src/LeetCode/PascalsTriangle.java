package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> generate(int numRows) {
        if(numRows==0)return result;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        if(numRows ==1){
            return result;
        }
        list = new ArrayList<>(list);
        list.add(1);
        result.add(list);
        if(numRows ==2){
            return result;
        }

        for(int i=2; i<numRows; i++){
            Integer[] pascal =new Integer[i+1];

            pascal[0]=1;
            pascal[i]=1;
            for(int j=0;j<list.size()-1;j++){
                pascal[j+1] = list.get(j)+list.get(j+1);
            }
            list = Arrays.asList(pascal);
            result.add(list);

        }

        return result;
    }

    public static void main(String[] args){
        generate(5);
    }
}
