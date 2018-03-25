package LeetCode;

import java.util.Date;

/**
 * Created by Roshni Velluva Puthanidam on 20/11/17.
 */
public class DivisionWithoutDivider {
    public int divide(int dividend, int divisor) {
        int current_divisor = divisor;
        int quotient_base =1;
        int quotient=0;
        long start = System.nanoTime();
        while(dividend >= divisor){
            if(dividend >= current_divisor){
                dividend -=current_divisor;
                quotient +=quotient_base;
                current_divisor <<= 1;
                quotient_base <<= 1;
            }
            else {
                current_divisor >>= 1;
                quotient_base >>= 1;
            }
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        return quotient;
    }
    public static void main(String[] args){
        DivisionWithoutDivider d = new DivisionWithoutDivider();
        System.out.println(d.divide(5000,2));
    }
}
