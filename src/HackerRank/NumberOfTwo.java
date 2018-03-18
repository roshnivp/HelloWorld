package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 10/02/17.
 */
import java.util.Scanner;


public class NumberOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer limit = sc.nextInt();
        int count=0;
        for (int i = 0; i < limit; i++) {
            int num = i;
            while(num != 0){
                int r = num %10;
                if(r == 2){
                    count++;
                 //   System.out.println(i);
                    break;
                }
                num = num /10;
            }
        }
        System.out.println(count);
    }
}