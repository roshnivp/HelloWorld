package LeetCode;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestCons= 1;
        int currentCons = 1;

        for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] ==1) {
                    currentCons += 1;
                } else {
                    longestCons = Math.max(longestCons, currentCons);
                    currentCons = 1;
                }

        }

        return Math.max(longestCons, currentCons);
    }

    public static void main(String[] args){
        System.out.println(longestConsecutive(new int[]{40,2,1,-100,9,3,101,102,103,104}));
    }

    }
