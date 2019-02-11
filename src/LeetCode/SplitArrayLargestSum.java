package LeetCode;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int m) {
         if(nums.length==0)return 0;
         int left =Integer.MIN_VALUE;
         int right =0;

         for(int num:nums){
             if(left<num)left=num;
             right+=num;
         }

         if(m==1)return right;//sum of all elements
         if(m==nums.length)return left;//max among all elements - largest sum

         while(left<right){
             int mid =(left+right)/2;

             if(canSplit(nums,mid,m)){//we can try to make the largest sum further less
                 right = mid;
             }
             else{
                 left= mid+1; //we can not split the array in m ways to get the given sum(mid) -->increase sum more
             }
         }
         return left;
    }

    private static boolean canSplit(int[] nums, int currentMax, int m) {//check whether array can split into specified no to get sum less or equal to currentMax
       int noOfSubArr = 1;
       int curSum=0;

       for(int num:nums){
           curSum+=num;
           if(curSum>currentMax){
               noOfSubArr++;
               curSum = num;
               if(noOfSubArr>m){
                   return false;
               }
           }


       }
       return true;
    }

    public static void main(String[] args){
        int[] nums= new int[]{7,2,5,10,8};
        System.out.println(splitArray(nums,3));
    }

}
