package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 15/01/18.
 */
public class ValidPallindromeOneDelete {
    static boolean validPalindrome(String s) {
        int i= 0;
        int j= s.length()-1;
        int count =0;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)) {
                count++;
                if(count>1) break;
                if(s.charAt(i) == s.charAt(j-1)) i--;
                else j++;
            }


            i++;
            j--;
        }
        if(count==0 || count==1) return true;
        return false;
    }
    public static void main(String[] args){
        System.out.print(validPalindrome("ebcbbececabbacecbbcbe"));
    }
}
