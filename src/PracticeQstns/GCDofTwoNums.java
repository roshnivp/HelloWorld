package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class GCDofTwoNums {
    static int gcdOfTwoNumbers(int num1, int num2){
        if(num2 == 0) return num1;
        return gcdOfTwoNumbers(num2, num1%num2);
    }
    public static void main(String[] args){
        System.out.println(gcdOfTwoNumbers(12,8));
    }

}
