package LeetCode;

import java.util.Date;

/**
 * Created by Roshni Velluva Puthanidam on 20/11/17.
 */
public class DivisionWithoutDivider {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);

        long new_dividend =dividend;
        long current_divisor=divisor;
        new_dividend = new_dividend > 0 ? new_dividend : -new_dividend;
        current_divisor = current_divisor > 0 ? current_divisor : -current_divisor;
        int count = 0;
        while (new_dividend >= current_divisor) {
            long sum=current_divisor;
            int quotient = 1;
            while (sum < new_dividend / 2) {
                sum <<= 1;
                quotient <<= 1;
            }
            new_dividend -= sum;
            count += quotient;
        }
        return isPositive ? count : -count;
    }
    public static void main(String[] args){
        DivisionWithoutDivider d = new DivisionWithoutDivider();
        System.out.println(d.divide(-2147483648, 2));
    }
}
