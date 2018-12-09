package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 30/11/17.
 */
public class EvenOddSeperation {

    public static void main(String[] args){
        int[] arr= new int[]{1,3,4,5,2,6};
        int[] new_arr = evenOddSep(arr);
        for(int i=0; i<new_arr.length; i++){
            System.out.print(new_arr[i]+" ");
        }
    }
    static int[] evenOddSep(int[] arr){
        int n= arr.length;

        int i=0;
        int j=0;

        while(i<n){
            if(arr[i]%2 == 0){
                swap(arr,i,j);
                j++;
            }
            i++;
        }
        return arr;
    }
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
