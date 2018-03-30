package PracticeQstns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 29/03/18.
 */
public class ArrayInterSection {
    public static void main(String[] args){
        int[] num1 = new int[]{1,4,6,8,9};
        int[] num2 = new int[]{2,3,6,9};
        int[] num3 = new int[]{5,6,8,9};

        List<Integer> result = findIntersections(num1,num2,num3);
        System.out.print(result.toString());
    }
    static List<Integer> findIntersections(int[] num1, int[] num2, int[] num3){
        List<Integer> result = new ArrayList<>();
        int x=0;
        int y=0;
        int z=0;


        while(x<num1.length && y<num2.length && z<num3.length){
            if((num1[x] == num2[y] && num2[y]==num3[z])){
                result.add(num1[x]);
                x++;
                y++;
                z++;
            }
            else if( num1[x]<num2[y]) x++;
            else if(num2[y]<num3[z]) y++;
            else  z++;
        }

        return result;
    }
}
