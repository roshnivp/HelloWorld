package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 18/02/17.
 */
public class ShortestPallindrome {
    public String shortestPalindrome(String s) {
        if (s.length() <= 1) return s;
        String reverse = (new StringBuilder(s)).reverse().toString();
        String target = s + "*" + reverse;
        int[] next = new int[target.length()];
        next[0] = 0;
        for (int i = 1; i < target.length(); i++) {
            int k = next[i - 1];
            while (k > 0 && target.charAt(k) != target.charAt(i))
                k = next[k - 1];
            next[i] = target.charAt(k) == target.charAt(i) ? k + 1 : k;
        }

        return reverse.substring(0, reverse.length() - next[target.length() - 1]) + s;
    }

    public static void main(String[] args) {
        ShortestPallindrome sp = new ShortestPallindrome();
        String res = sp.shortestPalindrome("bbca");
        System.out.println(res);

    }
}
