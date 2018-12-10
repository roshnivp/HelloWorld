package LeetCode;

public class validPallindrome {
    public static boolean validPalindrome(String s) {
        if(s.length()==0) return false;

        int i= 0;
        int j= s.length()-1;
        int count =0;

        if(isPallindrome(s,i,j)) return true;

        while(i++<j--){
            if(s.charAt(i)!=s.charAt(j)) return isPallindrome(s,i+1,j) || isPallindrome(s,i,j-1);
        }

        return false;
    }

    public static boolean isPallindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(validPalindrome("deeee"));
    }
}
