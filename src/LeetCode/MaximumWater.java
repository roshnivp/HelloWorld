package LeetCode;


/**
 * Created by Roshni Velluva Puthanidam on 01/11/17.
 */
public class MaximumWater {
    static int trap(int[] height) {

        int[] tallestLeft = new int[height.length];
        int[] tallestRight = new int[height.length];
        int sum = 0;

        tallestLeft[0] = height[0];
        for(int i=1; i<height.length; i++){
            tallestLeft[i]=Math.max(tallestLeft[i-1],height[i]);
        }

        tallestRight[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            if(i==height.length-1) tallestRight[i] =-1;
            tallestRight[i]=Math.max(tallestRight[i+1],height[i]);
        }
        for(int i=0; i<height.length; i++){
                sum += Math.min(tallestRight[i],tallestLeft[i]) - height[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = new int[]{5,1,3,4};
        System.out.println(trap((arr)));
    }
}
