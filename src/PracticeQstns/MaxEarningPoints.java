package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 16/10/17.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class MaxEarningPoints {
     int earned =0;

     long maxPoints(int[] elements) {

         if(elements.length==0) return 0;

        int max = elements[0];

        for(int i=1; i<elements.length; i++){
            if(max < elements[i]){
                max = elements[i];
            }
        }


         List<Integer> new_indexArray = new ArrayList<>();
         for(int j=0; j<max+1;j++){
             new_indexArray.add(0);
         }

         for(int i=0; i<elements.length; i++){
            int value = new_indexArray.get(elements[i]);
            new_indexArray.set(elements[i], value+elements[i]);
         }

         earningMoney(new_indexArray, new_indexArray.size()-1);

         return earned;
    }

     void earningMoney(List<Integer> arr,int k){

            if(k==1){
                  earned +=arr.get(k);
                  arr.remove(k);
            }
            else if(k ==arr.size()-1){
                if(arr.get(k) > arr.get(k-1)){
                    earned +=arr.get(k);
                    arr.remove(k);
                    arr.remove(k-1);
                }
                else earningMoney(arr,k-1);

            }
            else{
                if(arr.get(k)>arr.get(k+1) && arr.get(k)>(arr.get(k-1)+arr.get(k+1))){
                    earned +=arr.get(k);
                    arr.remove(k+1);
                    arr.remove(k);
                    arr.remove(k-1);
                }


                else if(arr.get(k)<=arr.get(k+1) || arr.get(k)<=(arr.get(k-1)+arr.get(k+1))){
                    earned +=arr.get(k+1);
                    arr.remove(k+1);
                    arr.remove(k);
                }
                else earningMoney(arr,k-1);
            }

         if (arr.size() >1) earningMoney(arr, arr.size()-1);

    }

    public static void main(String[] args) {
        int[] elements = {5,5,8,8,8,9};
        MaxEarningPoints mp = new MaxEarningPoints();
        System.out.println(mp.maxPoints(elements));
    }
}


