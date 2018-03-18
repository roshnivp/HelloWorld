package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 09/01/18.
 */
public class ContainerWithMostWaterUsingTwoLines {
    public static void main(String[] args){
        int[] arr = new int[]{5,1,3,4};
        System.out.println(maxArea((arr)));
    }
    static int maxArea(int[] height) {
        int leftCorner = 0;
        int rightCorner = height.length -1;

        int area =0;


        while(leftCorner < rightCorner){
            area = Math.max(area, Math.min(height[leftCorner], height[rightCorner])*(rightCorner - leftCorner));

            if(height[leftCorner] <height[rightCorner]){
                leftCorner +=1;
            }
            else{
                rightCorner -=1;
            }
        }
        return area;

    }
}
