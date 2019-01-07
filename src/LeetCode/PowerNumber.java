package LeetCode;

public class PowerNumber {
    public double myPow(double x, int n) {
        if(n >= 0) {
            return powNum(x, n);
        } else {
            return 1.0 / powNum(x , -n);
        }

    }

    public double powNum(double x, int n){
        if(n == 0) return 1;

        double y = powNum(x, n / 2);

        if(n % 2 == 0) {
            return y * y;
        } else {
            return y * y * x;
        }
    }

    public static void main(String[] args){
        PowerNumber pn = new PowerNumber();
        System.out.print(pn.myPow(0.00001,2147483647));
    }
}
