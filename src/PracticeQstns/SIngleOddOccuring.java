package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 10/12/17.
 */
public class SIngleOddOccuring {
    public static  void main(String[] args){
        System.out.println(singleOddElement(new int[]{1,2,3,1,2,3,4}));
    }
    static int singleOddElement(int[] arr){
        int result =0;
        for(int i:arr){
            result ^=i;
        }
        return result;
    }
}
