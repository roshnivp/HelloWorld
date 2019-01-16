package LeetCode;

public class IsPallindrome {
    public static boolean isPalindrome(String s) {

        int i =0;
        s=s.toLowerCase();
        int j = s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i)))i++;
            while(!Character.isLetterOrDigit(s.charAt(j)))j--;
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
