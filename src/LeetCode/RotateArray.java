package LeetCode;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n= nums.length;
        if(n==0) return;
        if(n==1) return;

        int[] temp = new int[k];

        if(k>n){
            for(int j=0; j<k; j++){

                rotate_array(nums);

            }
            return;
        }

        int i=0;

        for(int j=n-k; j<n;j++){
            temp[i]=nums[j];
            i++;
        }

        for(int j=n-k-1; j>=0; j--){

            nums[j+k]=nums[j];

        }

        for(int j=0; j<k; j++){
            nums[j]=temp[j];
        }


    }
    static void  rotate_array(int[] nums){
        int n= nums.length;
        int temp= nums[n-1];
        for(int i=n-1; i>0 ;i--){

            nums[i] =nums[i-1];
        }
        nums[0]= temp;
    }
    public static void main(String[] args){
        int[] nums= new int[]{1,2};
        rotate(nums,3);
        System.out.println(nums.toString());
    }


}
