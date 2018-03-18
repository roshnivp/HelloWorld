package PracticeQstns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 10/02/17.
 */
public class MatrixAdd {
    static boolean GigawattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {
        int[] new_battery = new int[batteryOne.length + batteryTwo.length];
        System.arraycopy(batteryOne, 0, new_battery, 0, batteryOne.length);
        System.arraycopy(batteryTwo, 0, new_battery, batteryOne.length, batteryTwo.length);
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;

        for (int k = 0; k < new_battery.length; k++) {
            hm.put(new_battery[k], k);

        }
        for (int k = 0; k < new_battery.length; k++) {
            int target = gigawattTarget - new_battery[k];
            if (hm.containsKey(target) && hm.get(target) >= batteryOne.length) {
                return true;
            }

        }
        return false;
    }

//        boolean energy = false;
//        for (int i = 0; i < batteryOne.length; i++) {
//            int k = batteryOne.length ;
//            while (k <= new_battery.length - 1) {
//                sum = new_battery[i] + new_battery[k];
//                if (sum == gigawattTarget) {
//                    energy = true;
//                }
//                k++;
//            }
//        }
//        return energy;


    public static void main(String[] args) {
        int[] batteryOne = new int[]{1, 4, 8, 9};
        int[] batteryTwo = new int[]{6, 4, 2, 7, 7, 8, 9};
        int out = 10;
        boolean result = MatrixAdd.GigawattPower(batteryOne, batteryTwo, out);
        if (result) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
