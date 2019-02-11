package LeetCode;

import java.util.PriorityQueue;

public class KthLargestInaStream {
    int kthElem=0;
    PriorityQueue<Integer> pq;
    public KthLargestInaStream(int k, int[] nums) {
        kthElem=k;
        pq = new PriorityQueue<>();

        for(int i:nums){
            add(i);
        }
    }

    public int add(int val) {
        if(pq.size()<kthElem){
            pq.offer(val);
        }
        else{
            if(pq.peek()<val){
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();

    }
    public static void main(String[] args){
        KthLargestInaStream obj = new KthLargestInaStream(3,new int[]{1,5,2,6});
        System.out.println(obj.add(8));
        System.out.println(obj.add(3));
        System.out.println(obj.add(10));
        System.out.println(obj.add(4));



    }
}
