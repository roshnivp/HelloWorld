package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 29/11/17.
 */
public class Compliment {
    public int findComplement(int num) {
        System.out.println(Integer.highestOneBit(num));
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;
    }
    public static void main(String[] args){
        Compliment c= new Compliment();
        System.out.print(c.findComplement(3));
    }
}
