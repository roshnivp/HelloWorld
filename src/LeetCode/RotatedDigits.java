package LeetCode;

public class RotatedDigits {
    public static int rotatedDigits(int N) {
       if(N==0)return 0;
       int ans =0;
       for(int i=1; i<=N; i++){
           if(isGood(i,false)) ans++;
       }
       return ans;
    }

    public static boolean isGood(int num, boolean flag){
        if(num==0)return flag;

        int n=num%10;//get last digit
        if(n==3 || n==4 ||n==7)return false;
        if(n==0 || n==1 || n==8)return isGood(num/10,flag);
        return isGood(num/10,true);


    }

    public static void main(String[] args){
        System.out.println(rotatedDigits(12));
    }
    //A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves;
    // 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not
    // rotate to any other number and become invalid.
    //3,4,7 are invalid
}
