package LeetCode;

public class BinaryToDecimel {
    public int solution(String S) {
        // write your code in Java SE 8
       // int number = getDecimelNumber(Integer.valueOf(S));
        int number=Integer.parseInt(S, 2);
        System.out.println(number);
        int count=0;

        while(number!=0){
            while(number%2==0){
                number>>=1;
                count++;
            }
            if(number%2!=0){
                number=subtract(number,1);
                count++;
            }
        }
        return count;
    }
    public int subtract(int x, int y)
    {

        if (y == 0)
            return x;

        return subtract(x ^ y, (~x & y) << 1);
    }

//    public int getDecimelNumber(int num){
//        int number = 0;
//        int p = 0;
//        while(true){
//            if(num == 0){
//                break;
//            } else {
//                int temp = num%10;
//                number += temp*Math.pow(2, p);
//                num = num/10;
//                p++;
//            }
//        }
//        return number;
//    }

//    public int getNumber(String S){
//        int i= S.length()-1;
//        int k=0;
//        int num=0;
//        while(i>=0){
//            if(S.charAt(i)=='1'){
//                num+=Math.pow(2,k);
//            }
//            k++;
//            i--;
//
//        }
//        return num;
//    }
    public static void main(String[] args){
        BinaryToDecimel bd = new BinaryToDecimel();
        System.out.println(bd.solution("11110100001001000000"));
    }
}

