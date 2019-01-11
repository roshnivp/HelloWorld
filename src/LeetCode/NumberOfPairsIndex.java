package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsIndex {
    public static void main(String[] args){
        int[] arr =new int[]{3,4,2,3,3,2,3,4};
        System.out.print(getNumberOfPairs(arr));
    }

    public static int getNumberOfPairs(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            map.put(arr[i],(map.getOrDefault(arr[i],0))+1);
        }

        int sum =0;
        int noOfPairs=0;
        for(int num:map.values()){
            noOfPairs= (num * (num-1))/2;
            sum+=noOfPairs;
        }
        return sum;
    }

}
