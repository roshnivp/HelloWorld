package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;

public class HeaterRadius {
    public int findRadius(int[] houses, int[] heaters) {//mlogn time
        TreeSet<Integer> set = new TreeSet<>();
        int radius  = Integer.MIN_VALUE;
        for(int heater:heaters){
            set.add(heater);
        }

        for(int house:houses){
            Integer upHeater = set.ceiling(house);
            Integer lowHeater = set.floor(house);

            radius = Math.max(radius, Math.min(upHeater==null?Integer.MAX_VALUE:upHeater-house, lowHeater==null?Integer.MAX_VALUE:house-lowHeater));
        }
        return radius;
    }

    public static int findRadius1(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);
        int m = houses.length;
        int n= heaters.length;
        if(heaters[0]>houses[m-1]){
            return heaters[0]-houses[0];
        }
        if(heaters[n-1]<houses[0]){
            return houses[m-1]-heaters[n-1];
        }

        int l = 0;
        int radius = 0;
        for (int i = 0; i < m; i++) {
            while (l<(n-1) && heaters[l]<houses[i]) l++;
            if (l == 0) {
                radius = Math.max(radius, Math.abs(heaters[l] - houses[i]));
            }
            else if(heaters[l]<houses[i]){
                radius = Math.max(radius, houses[i] -heaters[l]);
            }
            else {
                int temp = Math.min(houses[i] - heaters[l - 1], heaters[l] - houses[i]);
                radius = Math.max(radius, temp);
            }
        }

        return radius;
    }

    public static void main(String[] args){
        System.out.println(findRadius1(new int[]{1,5},new int[]{2}));
    }
}
