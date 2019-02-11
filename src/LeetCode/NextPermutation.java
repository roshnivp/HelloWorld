package LeetCode;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        System.out.println(Arrays.toString(nums));
           if(nums==null || nums.length==0)return;

           for(int i=nums.length-2;i>=0;i--){
               if(nums[i+1]>nums[i]){//find the point where decreasing array breaks 4231 --> at 2
                   int j=i+1;
                   while(j<nums.length && nums[j]>nums[i]){
                       j++;
                   }
                   swap(nums,i,j-1);//swap the droping point with next highest element
                   reverse(nums,i+1);
                   System.out.println(Arrays.toString(nums));
                   return;
               }
           }
        reverse(nums,0);
        System.out.println(Arrays.toString(nums));
        return;

    }

    public void reverse(int[] nums,int i){
        int j= nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        NextPermutation np = new NextPermutation();
        np.nextPermutation(new int[]{5,2,1});

    }
}
