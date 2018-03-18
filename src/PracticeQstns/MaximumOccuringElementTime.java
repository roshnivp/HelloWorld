package PracticeQstns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;

/**
 * Created by Roshni Velluva Puthanidam on 30/09/17.
 */
public class MaximumOccuringElementTime {

    public static void main (String[] args)
    {

        int arr[] = {2, 3, 20, 20, 2, 20, 3, 3};
        int n = arr.length;


        System.out.println("minimum distance between max repeating element is: " +maxRepeating(arr,n));
               // minDist(arr,n,x));
    }

    static int maxRepeating(int[] arr,int n){

        Map<Integer,Integer> hm= new HashMap<>();
        int result =0;

        for(int i=0; i<n; i++){

            if(hm.containsKey(arr[i])){
                int count = hm.get(arr[i]);
                hm.put(arr[i],count+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        int freq =0;
        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,Integer> hm1: hm.entrySet()){

            if(freq <= hm1.getValue()){
                freq = hm1.getValue();

            }
        }
        for(Map.Entry<Integer,Integer> hm1: hm.entrySet()){

            if(freq == hm1.getValue()){
                ans.add(hm1.getKey());

            }
        }

        int res= minDist(arr,ans,n);
        return res;
    }

    static int minDist(int arr[], List<Integer> list, int n)
    {
        int i, j;
        int min_dist = arr.length;

        for(int k=0; k<list.size(); k++){
            int x= list.get(k);
            int temp = min_dist;
            boolean flag = false;

            for (i = 0; i < n; i++)
            {
                if(x== arr[i]){
                    for (j = n-1; j >=i+1; j--)
                    {
                        if( x == arr[j] )
                        {
                            min_dist = Math.abs(i-j);
                            flag= true;
                            break;
                        }
                    }
                }

                if(flag) break;


            }
            if(min_dist > temp) min_dist=temp;
        }

        return min_dist;
    }

}
