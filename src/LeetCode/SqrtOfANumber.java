package LeetCode;

public class SqrtOfANumber {
    public static int mySqrt(int x) {
        if(x==0) return 0;
        if (x == 0 || x == 1) return x;
        long left = 1; long right = x / 2;

        long mid=0;
        long val =x;
        while (left<=right)
        {
            mid = (left+right)/2;
            if ((mid * mid) > val)
            {
                right = mid - 1;
            }
            else
            {
                if (((mid + 1) *  (mid + 1) )> val  ) break;
                left = mid + 1;
            }
        }
        return (int)mid;

    }

    public static void main(String[] args){
        System.out.print(mySqrt(214739));
    }
}
