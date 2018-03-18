package PracticeQstns;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 25/02/17.
 */
public class SumArray {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3};
        int sum = SumArray.reductionCost(num);
        System.out.println(sum);

    }

    static int reductionCost(int[] num) {
        List<Integer> result = new ArrayList<Integer>();
        for (int index = 0; index < num.length; index++) {
            result.add(num[index]);
        }
        int total = 0;
        int i = 01;
        while (i != 0) {
            Collections.sort(result);
            // System.out.println(result.get(0));
            int s = result.get(0);
            int sum = result.get(i - 1) + result.get(i);
            result.add(sum);
            result.remove(i - 1);
            result.remove(i - 1);
            s = result.get(0);
            i = 1;
            total += sum;
            if (result.size() == 1) {
                break;
            }

        }
        return total;
    }

}
