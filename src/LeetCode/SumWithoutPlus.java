package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 24/10/17.
 */
public class SumWithoutPlus {
    static int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int sum,carry;
        sum = a^b;
        carry = (a&b)<<1;
        return getSum(sum,carry);//
    }
    public static void main(String[] args){
        System.out.println("Sum is:"+getSum(3,5));
    }
}
