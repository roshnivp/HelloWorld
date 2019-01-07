package LeetCode;

public class BitOperator {
    public static void main(String[] args){
        System.out.println("addition:"+addition(3,5));
        System.out.println("substraction:"+substraction(8,5));
        System.out.println("multiply by 2:"+multiply(8));
        System.out.println("division by 2:"+division(8));


    }


    public static int addition(int x, int y){
        if(y==0){
            return x;
        }
        return addition(x ^ y, (x & y)<<1);
    }

    public static int substraction(int x, int y){
        if(y==0){
            return x;
        }
        return substraction(x ^ y, (~x & y) <<1);
    }

    public static int multiply(int x){
        return x<<=1;
    }
    public static int division(int x){
        return x>>=1;
    }
}
