package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static String getPermutation(int n, int k) {

       //get all numbers
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n; i++){
            list.add(i);
        }

        //to get the element using 0 based index
        k--; //0 to k-1 element

        //get factorial of n
        int fact = 1;
        for(int i=1;i<=n; i++) {
            fact *= i;
        }

        //find the combination http://www.zrzahid.com/k-th-permutation-sequence/
        //first n-1! elements are start with 0th index(1),second n-1! starts with first index(2) etc

        String res = "";
        for(int i=0; i<n;i++){
            fact = fact /(n-i);
            //find index of first element
            int index = k/fact;
            k = k%fact;// we are skipping first (n-1)! elements since we come to know the first position

            res +=list.get(index);
            list.remove(index);
        }
        return res;

    }

    public static void main(String[] args){
        System.out.println(getPermutation(4,9));
    }
}
