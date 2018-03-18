package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 22/02/17.
 */
public class PallindromeOrNot {
    public static void main(String[] args){
        PallindromeOrNot p = new PallindromeOrNot();
        int n= 12421;
        boolean ans = p.isPallindrome(n);
        System.out.println(ans);

    }
    boolean isPallindrome(int x){

        int rev =0;
       // int ans =0;
        int n=x;
        if(x ==0 || x<0){
            return false;
        }
        while(x!=0){
            int temp = x%10;
            rev = rev*10 + temp;
           // ans =rev;
            x= x/10;
        }
        return n == rev;


    }
}
