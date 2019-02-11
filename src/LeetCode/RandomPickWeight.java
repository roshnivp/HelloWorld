package LeetCode;

import java.util.Arrays;
import java.util.Random;

public class RandomPickWeight {
    int[] weightedSum ;
    int n=0;
    Random random;
    public RandomPickWeight(int[] w) {
        random = new Random();
        n =w.length;
        weightedSum = new int[n];
        weightedSum[0]=w[0];
        for(int i=1; i<n; i++){
            weightedSum[i] =weightedSum[i-1]+w[i];
        }
    }

    public int pickIndex() {
        int rand = random.nextInt(weightedSum[n-1]) + 1;
        System.out.println(rand);
        int index = Arrays.binarySearch(weightedSum,rand);//return insertion position of rand in the weightedSum, if not present (-insertionPos -1)returns
        return index>=0?index:-(index)-1;

    }

    public static void main(String[] args){
        RandomPickWeight r = new RandomPickWeight(new int[]{2,5,6,8});//0 index 2 times, 1 index 5 times, 2 index 6 times --> randomly picks an index in proportion to its weight.
        System.out.println(r.pickIndex());

    }
}
