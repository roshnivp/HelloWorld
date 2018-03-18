package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 30/11/17.
 */
public class SameRange {
    public List<String> summaryRanges(int[] nums) {
        int n= nums.length;
        List<String> ls = new ArrayList<>();
        int count=0;
        for(int j=0; j<n-1; j++){
            if(nums[j+1] - nums[j]==1) {
                count++;
                if(j== n-1)ls.add(nums[j-count]+"->"+nums[j]);
            }
            else{

                if(count==0) ls.add(nums[j]+"") ;
                else{
                    ls.add(nums[j-count]+"->"+nums[j]);
                    if(j == n-2) ls.add(nums[j+1]+"");
                }
                count=0;

            }
        }
        return ls;
    }

    public static void main(String[] args){
        SameRange sr = new SameRange();
        sr.summaryRanges(new int[]{0,1,2,4,5,7});
    }
}
