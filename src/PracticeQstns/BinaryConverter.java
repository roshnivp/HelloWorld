package PracticeQstns;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 29/09/17.
 */
public class BinaryConverter {
    public static void main(String[] args)
    {
        int[] arr = new int[]{7,3,8,9,4,5};
        BinaryConverter bc = new BinaryConverter();
        int[] ans= convertDecimel(arr);
        for(int i=0; i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    static int[] convertDecimel(int[] arr){
        int n = arr.length;
        //int[] new_arr = new int[n];
        Map<Integer,Integer> hm =new HashMap<>();
        for(int i=0; i<n; i++){

            int num, count = 0, a;
            num= arr[i];
            String x = "";
            while(num > 0)
            {
                a = num % 2;
                if(a == 1)
                {
                    count++;
                }
                x = a+""+x;
                num = num / 2;
            }
            hm.put(arr[i],count);

        }
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();

        List<Map.Entry> list = new ArrayList<Map.Entry>(set);

        Collections.sort( list, new Comparator()
        {
            public int compare(Object o1, Object o2 )
            {
                Integer v1 = (Integer) ((Map.Entry)o1).getValue();
                Integer v2 = (Integer) ((Map.Entry)o2).getValue();
                return v2.compareTo( v1 );
            }
        } );

        List<Integer> result =new ArrayList<>();
        for(int k=0; k<list.size(); k++){
            result.add((int)(list.get(k)).getKey());
        }

         int[] final_order = new int[result.size()];

        for(int i=0; i<final_order.length;i++){
            final_order[i] = result.get(i);
        }

        return final_order;

    }

}
