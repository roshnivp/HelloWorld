package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Roshni Velluva Puthanidam on 15/01/18.
 */
public class KSmallestPair {

        // Function to find k pairs with least sum such
        // that one elemennt of a pair is from arr1[] and
        // other element is from arr2[]
        static List<int[]> kSmallestPair(int nums1[], int n1, int nums2[],
                                  int n2, int k)
        {
            PriorityQueue<int[]> que = new PriorityQueue<>((a, b)->a[0]+a[1]-b[0]-b[1]);
            List<int[]> res = new ArrayList<>();
            if (k > n1*n2)
            {
                System.out.print("k pairs don't exist");
                return res;
            }


            if(n1==0 || n2==0 || k==0) return res;

            for(int i=0; i<nums1.length && i<k; i++){
                que.offer(new int[]{nums1[i], nums2[0], 0});
            }
            while(k > 0 && !que.isEmpty()){
                int[] cur = que.poll();
                res.add(new int[]{cur[0], cur[1]});
                if(cur[2] == nums2.length-1) continue;
                que.offer(new int[]{cur[0],nums2[cur[2]+1], cur[2]+1});
                k--;
            }
            return res;
        }


        public static void main (String[] args)
        {
            int arr1[] = {1, 3, 11};
            int n1 = arr1.length;

            int arr2[] = {2, 4, 8};
            int n2 = arr2.length;

            int k = 4;
            List<int[]> ans =kSmallestPair( arr1, n1, arr2, n2, k);
            for(int i=0; i<ans.size(); i++){
                System.out.println(ans.get(i));
            }
        }

}
