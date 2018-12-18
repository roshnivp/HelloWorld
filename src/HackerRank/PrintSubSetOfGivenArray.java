package HackerRank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roshni Velluva Puthanidam on 28/02/17.
 */
public class PrintSubSetOfGivenArray {
    static int[] arr = new int[100];
    static String set = "abc";
    public static void main(String[] args) {
        int n = set.length();
        toBin(0, n);
    }
    /**
     * @param i
     * @param n
     */
    private static void toBin(int i, int n) {
        Set<String> hashset = new HashSet<String>();
        if(i == n){
            for(int j = 0; j < n; j++){
                if(arr[j] == 1){
                    hashset.add(""+set.charAt(j));
                  //  System.out.print(""+set.charAt(j));
                }
            }
        //    System.out.println("}");
            return;
        }
        arr[i] = 0;
        toBin(i+1, n);
        arr[i] = 1;
        toBin(i+1, n);

    }
}