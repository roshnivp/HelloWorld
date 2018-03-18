package HackerRank;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 17/02/18.
 */
public class MaxSum {
    public static void main(String[] args){
        int[][] arr = new int[][]{{-1},{10}};
        System.out.println(maxSum(arr));
    }

    static  int maxSum(int[][] matrix){
        int m= matrix.length;
        int n= matrix[0].length;
        Map<Integer,Integer> hm = new HashMap<>();
        int[] index= new int[2];

        for(int j=0; j<n; j++){
            int sum =0;
            for(int i=0;i<m;i++){
                sum +=matrix[i][j];
            }
            hm.put(j,sum);
        }
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);


        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        for(int k=0; k<2; k++){
            index[k]=list.get(k).getKey();
        }

        for(int i=0; i<2;i++){
            int indx = index[i];
            for(int j=0; j<m;j++){
                matrix[j][indx]*=-1;
            }

        }
        int result =0;
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                result +=matrix[i][j];
            }
        }
        return result;
    }
}
