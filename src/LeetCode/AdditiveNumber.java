package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        if(num.length()<3) return false;
        int n=num.length();
        String str = num;
        List<Integer> ls = new ArrayList<>();

        ls.add(Character.getNumericValue(str.charAt(0)));
        ls.add(Character.getNumericValue(str.charAt(0)));


        for(int i=2; i<n&&str.length()!=0; i++){
            int target = ls.get(ls.size()-1)+ ls.get(ls.size()-2);
            str = num.substring(i,n);
            String numToBeChecked = Integer.toString(target);
            if(str.indexOf(numToBeChecked)==-1) return false;
            ls.add(target);
            i+=numToBeChecked.length()-1;
        }


        return true;
    }

    public static void main(String[] args){
        System.out.println(isAdditiveNumber("199100199"));
    }
}
