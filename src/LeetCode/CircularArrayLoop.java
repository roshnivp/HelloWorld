package LeetCode;

public class CircularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        if(n<=1)return false;

        for(int i=0;i<n;i++){
            if(nums[i]==0)continue;
            int step = nums[i];
            nums[i] = 0;

            int next = (i+step+n) % n;
            if(next==i)continue;

            while(step*nums[next]>0){
                step = nums[next];
                nums[next] = 0;
                next = (next+step+n) % n;
            }
            if(next==i)return true;

        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(circularArrayLoop(new int[]{2,-2,2,2,1,1}));
    }
}
