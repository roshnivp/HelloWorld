package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 09/02/17.
 */
public class InfiniteImprobability {

    public static void main(String[] args) {
        InfiniteImprobability i = new InfiniteImprobability();

        String num = "43252";
        int rem = 2;
        String s = InfiniteImprobability.improbabilityCalculator(num, rem);
        System.out.println(s);

    }

    static String improbabilityCalculator(String coordinates, int remove) {

        String res = "";
        res = smallestNumber(coordinates, remove, res);

        return res;
    }

    static String smallestNumber(String str, int n, String res) {

        if (n == 0) {
            res = res + str;
            return res;
        }
        int len = str.length();

        if (len <= n) {
            return res;
        }

        int minIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (str.charAt(i) < str.charAt(minIndex)) {
                minIndex = i;
            }
        }

        res = res + String.valueOf(str.charAt(minIndex));
        String newString = str.substring(minIndex + 1);
        res = smallestNumber(newString, n - minIndex, res);
        return res;
    }

}
