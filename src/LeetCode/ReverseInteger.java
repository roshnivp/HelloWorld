package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 10/02/17.
 */
public class ReverseInteger {
    int reverse(int x) {
        int ans = 0;
        while (x !=0) {
            int temp = ans * 10 + x % 10;
            if (temp / 10 != ans)
                return 0;
            ans = temp;
            x /= 10;
        }
        return ans;

    }
    public static void main(String[] args){
        ReverseInteger r=new ReverseInteger();
        int k= r.reverse(234);
        System.out.println(k);
    }
}
