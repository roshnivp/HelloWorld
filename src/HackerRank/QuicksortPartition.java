package HackerRank;
import java.util.*;
/**
 * Created by Roshni Velluva Puthanidam on 21/07/16.
 */
public class QuicksortPartition {
    static void partition(int[] ar) {
        ArrayList<Integer> left=new ArrayList<Integer>();
        // int[] left=new int[]{};
        int leftIndex=0;
        ArrayList<Integer> right=new ArrayList<Integer>();
        int rightIndex=0;
        ArrayList<Integer> equal =new ArrayList<Integer>();
        int equalIndex=0;
        equal.add(equalIndex,ar[0]);
        for(int i=1;i<ar.length;i++) {

            if (ar[i]<ar[0]){
                left.add(leftIndex,ar[i]);
                leftIndex++;
            }
            else if(ar[i]>ar[0])
            {
                right.add(rightIndex,ar[i]);
                rightIndex++;
            }
            else{
                equalIndex++;
                equal.add(equalIndex,ar[i]);

            }
        }

        ArrayList<Integer> new_Arr=new ArrayList<Integer>();
        for(int i=0;i<left.size();i++){
           new_Arr.add(left.get(i));
        }
        for(int i=0;i<equal.size();i++){
            new_Arr.add(equal.get(i));
        }
        for(int i=0;i<right.size();i++){
            new_Arr.add(right.get(i));
        }
        for (int i=0;i<new_Arr.size();i++) {
            System.out.print(new_Arr.get(i)+" ");
        }
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }

    /**
     * Created by Roshni Velluva Puthanidam on 09/02/17.
     */
    public static class Improbability {

        static String improbabilityCalculator(String coordinates, int remove) {
            String res = "";
            res = improbabilityCalculator(coordinates, remove, res);
            return res;
        }

        static String improbabilityCalculator(String str, int n, String res) {

            if (n == 0) {
                res = res.concat(str);
                //  res = result.toString();
                return res;
            }

            int len = str.length();
            if (len <= n) {
                // res = "0";
                return res;
            }

            int minIndex = 0;
            for (int i = 0; i <= n; i++) {
                if (str.charAt(i) < str.charAt(minIndex)) {
                    minIndex = i;
                }
            }

            String element = new String(String.valueOf(str.charAt(minIndex)));
            res = res.concat(element);
            //res = result.toString();
            String newString = str.substring(minIndex + 1);
            res = improbabilityCalculator(newString, n - minIndex, res);
            return res;
        }

        public static void main(String[] args) {
            //  Improbability i=new Improbability();

            String s = "9157299021";
            int num = 3;
            String res = Improbability.improbabilityCalculator(s, num);
            System.out.println(res);

        }
    }
}
