package LeetCode;

public class FirstMissingPositiveInteger {

    public static void main(String[] args){
        int[] new_arr = new int[]{1, 3, 6, 4, 1, 2};
        System.out.println(firstMissingPositiveInteger(new_arr));
    }


    static int firstMissingPositiveInteger(int[] arr){

        int i=0;

        while(i<arr.length){

            if(arr[i]==i+1 || arr[i]<=0 || arr[i]>arr.length ||  arr[i]==arr[arr[i]-1]){
                i++;
            }
            else swapElements(arr,i, arr[i]-1);
        }
        i=0;

        while(i<arr.length){
            if(arr[i]!=i+1) return i+1;
            i++;
        }
        return i+1;
//        for(int i=0; i<A.length; i++){
//            if(A[i]==i+1 || A[i]<=0 || A[i]>A.length || A[i]==A[A[i]-1]){
//                i++;
//            }
//            else{
//                int temp = A[i];
//                A[i]=A[A[i]-1];
//                A[A[i]-1]=temp;
//            }
//        }
//        int i=0;
//        while(i<A.length){
//            if(A[i]!=i+1) return i+1;
//            i++;
//        }
//        return i+1;
    }

    static void swapElements(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
