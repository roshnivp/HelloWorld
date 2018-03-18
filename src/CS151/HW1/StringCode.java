package CS151.HW1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Roshni Velluva Puthanidam on 31/08/16.
 */


public class StringCode {


    /**
     * Given a string, returns the length of the largest run.
     * * A a run is a series of adajcent chars that are the same.  * @param str  * @return max run length
     */
    public static int maxRun(String str) {

        // TODO ADD YOUR CODE HERE
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] chr_array = str.toCharArray();
        int length = 1;

        if (chr_array.length == 0) {
            return 0;
        }
        for (int i = 0; i < chr_array.length; i++) {

            if (hm.containsKey(chr_array[i])) {

                int count = hm.get(chr_array[i]);
                hm.put(chr_array[i], count + 1);
                if (length <= hm.get(chr_array[i])) {
                    length = hm.get(chr_array[i]);
                }

            } else {
                hm.clear();
                hm.put(chr_array[i], 1);

            }
        }

        return length;
    }

    /**
     * Given a string, for each digit in the original string,
     * * replaces the digit with that many occurrences of the character
     * * following. So the string "a3tx2z" yields "attttxzzz".
     * * @param str  * @return blown up string
     */

    public static String blowup(String str) {
        // TODO ADD YOUR CODE HERE
        String append = "";


        for (int i = 0; i < str.length() - 1; i++) {
            if (!Character.isLetter(str.charAt(i))) {
                int digit = Character.getNumericValue(str.charAt(i));
                for (int j = 0; j < digit; j++) {
                    append = append + str.charAt(i + 1);
                }
                str = str.substring(0, i) + append + str.substring(i + 1, str.length());
            }
            append = "";
        }
        return str;
    }

    public static void main(String[] args) {
//
        String str = "aaa4bbc2a";
        String result_str = StringCode.blowup(str);
        System.out.println(result_str);
        Integer length = StringCode.maxRun(str);
        System.out.println(length);

    }
}