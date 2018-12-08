package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 15/10/17.
 */
public class MissingTwoNumbers {

    static int[] missingNumbers(int[] arr){
        int size = arr.length+2; // two numbers are missing

        int totalSum = size * (size+1) /2;
        int arraySum = 0;

        for(int i:arr){
            arraySum+= i;
        }

        int pivot = (totalSum - arraySum )/2 ;
        int tolalLeftXor = 0;
        int totalRightXor = 0;
        int arrayLeftXor = 0;
        int arrayRightXor = 0;

        for(int i=1; i<=pivot; i++){
            tolalLeftXor ^=i;
        }
        for(int i=pivot+1; i<=size; i++){
            totalRightXor ^=i;
        }

        for(int i:arr){
            if(i<= pivot){
                arrayLeftXor ^=i;
            }
            else{
                arrayRightXor ^=i;
            }
        }

        return new int[]{tolalLeftXor ^ arrayLeftXor, totalRightXor ^ arrayRightXor};


    }

    public static void main(String[] args){
        int[] nums = new int[]{1,4,5,6,7};
        int[] result =missingNumbers(nums);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
