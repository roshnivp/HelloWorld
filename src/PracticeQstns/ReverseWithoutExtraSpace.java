package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 10/12/17.
 */
public class ReverseWithoutExtraSpace {
    public static void main(String[] args){
        int[] ans = reverseAnArray(new int[]{1,6,3,8,2});
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    static int[] reverseAnArray(int[] arr){
        int i= 0;
        int j= arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
