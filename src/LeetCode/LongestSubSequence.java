package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 03/08/16.
 */
public class LongestSubSequence {

    public static void main(String[] args){
        String s1="XTGA";
        String s2="YAGA";
        LongestSubSequence ls=new LongestSubSequence();
        int t=ls.lcsLength(s1,s2,s1.length(),s2.length());
        System.out.println(t);
    }

     int lcsLength(String X, String Y, int m, int n)
    {
        if ((m == 0) || (n == 0)) {
            return 0;
        }
        else if (X.charAt(m-1) == Y.charAt(n-1)) {
            return 1 +
                    lcsLength
                            (X, Y, m-1, n-1);
        }
        else {
            return Math.max(
                    lcsLength
                            (X, Y, m, n-1),
                    lcsLength
                            (X, Y, m-1, n));
        }
    }
}
