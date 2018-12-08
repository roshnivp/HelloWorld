package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 09/01/18.
 */
public class PallindromeNumber {

    public static void main(String[] args){
        int number = 12321;
        System.out.println(isPallindrome(number));
    }

    static boolean isPallindrome(int num){
        if(num<0 || num/10 ==0 || num==0) return false;
        int reverseNum = 0;

        while(num > reverseNum){ // reverse last half of the numbers
            reverseNum = reverseNum*10 + num%10;
            num = num/10;
        }
        if(num == reverseNum || num == reverseNum/10) return true; // if reverseNum have odd number of digits avoid last digit
        return false;
    }
}
