package LeetCode;
import java.util.*;
/**
 * Created by Roshni Velluva Puthanidam on 04/08/16.
 */
public class TopKFrequent {

     List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hm=new HashMap<>();
        int num=0;

        for (int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])){
                int count= hm.get(nums[i]);
                hm.put(nums[i],count+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }
//        List<Integer> new_list=new ArrayList<>();
        List<Integer> result=new ArrayList<>();

         Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
         List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);

         Collections.sort( list, new Comparator()
         {
             public int compare(Object o1, Object o2 )
             {
                 Integer v1 = (Integer)((Map.Entry)o1).getValue();
                 Integer v2 = (Integer)((Map.Entry)o2).getValue();
                 return (v2).compareTo( v1);
             }
         } );


         for(Map.Entry<Integer, Integer> entry:list){
             result.add(entry.getKey());
             num++;
             if(num==k){
                 break;
             }

         }        return result; // if(list.size() >k) return (list.get(k)).getKey(); -- kth frequent
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,5,2,6,1,2,1,1};
        int k = 2;
        TopKFrequent tk = new TopKFrequent();
        List<Integer> result = tk.topKFrequent(arr,k);
        System.out.print(result);
    }
}
