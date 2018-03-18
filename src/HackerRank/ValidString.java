package HackerRank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Roshni Velluva Puthanidam on 25/02/17.
 */
public class ValidString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ValidString vs = new ValidString();
        boolean res = vs.isValid(str);
        if (res) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }


    }

    boolean isValid(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] new_str = str.toCharArray();


        for (int i = 0; i < new_str.length; i++) {
            if (hm.containsKey(new_str[i])) {
                int count = hm.get(new_str[i]);
                hm.put(new_str[i], count + 1);
            } else {
                hm.put(new_str[i], 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
            //Character name=hm1.getKey();
            Integer count = hm1.getValue();
            result.add(count);
            //System.out.println(name+" visited "+count+" times");
        }
        int j = 0;
        int val = 0;
        int diff = 0;
        int comp = Integer.MIN_VALUE;
        //for(int j=0; j<result.size()-1; j++){
        while (j < result.size() - 1) {

            diff = Math.abs(result.get(0) - result.get(j + 1));
            if (diff >= 1) {
                val++;
                // return false;
            } else if (diff > comp) {
                comp = diff;
            }
            j++;
        }
        return !(comp > 1 || val > 1);
    }
}
