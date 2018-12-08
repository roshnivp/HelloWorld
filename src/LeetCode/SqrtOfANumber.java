package LeetCode;

public class SqrtOfANumber {
    public static int mySqrt(int x) {
        if(x==0) return 0;
        if (x == 0 || x == 1) return x;
        int left = 1, right = x / 2;
        while (true)
        {
            int mid = (left + right) / 2;
            if (mid > x / mid)
            {
                right = mid - 1;
            }
            else
            {
                if (mid + 1 > x / (mid + 1)) return mid;
                left = mid + 1;
            }
        }

    }

    public static void main(String[] args){
        System.out.print(mySqrt(2147395599));
    }
}
