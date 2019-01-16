package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 03/08/16.
 */

        import java.util.*;
/**
 * Created by roshni on 5/20/16.
 */
public class LongestSubString {


        int lengthOfLongestSubsequence(String s) {
           // HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            List<Character> hm = new ArrayList<>();
            int max=0, start =0, end=0;

            for (int i = 0; i < s.length(); i++) {
                if (hm.contains(s.charAt(i))) {
                    start++;
                }
                hm.add(s.charAt(i));
                end++;
                max = end - start;
            }
            return max;

        }
        int lengthOfLongestSubstring(String s) {
            int length=0;
            int n =s.length();
            if(n==0 || n==1) return n;
            Map<Character, Integer> hm = new HashMap<>();

            for (int i = 0, left=0; i < n; i++) {
                if (hm.containsKey(s.charAt(i))) {
                    left = Math.max(left,hm.get(s.charAt(i))+1);
                }
                hm.put(s.charAt(i),i);
                length = Math.max(length,i-left+1);
            }

            return length;
        }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String theString = "abcbad";
        LongestSubString vm=new LongestSubString();
        int length=vm.lengthOfLongestSubsequence(theString);
        int length_sub=vm.lengthOfLongestSubstring(theString);
        System.out.println(length);
        System.out.println(length_sub);
    }

}
