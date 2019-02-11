package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostToHire {
    public static double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        int n = quality.length;
        double[][] workers = new double[n][2];
        for (int i = 0; i < n; i++) {
            double ratio = (double) wage[i] / quality[i];
            workers[i] = new double[]{ratio, (double) quality[i]};
        }

        Arrays.sort(workers, (a, b)->Double.compare(a[0], b[0]));//asc order of ratio
        PriorityQueue<Double> pq = new PriorityQueue<>();////min heap with negative quality -- equal to max heap for quality

        double total = Double.MAX_VALUE, qualitySum = 0;
        for (double[] worker: workers) {
            qualitySum += worker[1];
            pq.offer(-worker[1]);
            if (pq.size() > K) {
                double minQuality = pq.poll();//neg of max quality
                qualitySum += minQuality;//equal to minus the max quality
            }
            if (pq.size() == K) {
                double curTotal = qualitySum*worker[0];
                total = Math.min(total, curTotal);
            }
        }

        return total;
    }
    public static void main(String[] args){
        int[] quality= new int[]{5,10,20,25};
        int[] wage = new int[]{15,20,40,40};
        int K= 3;
        System.out.println(mincostToHireWorkers(quality,wage,K));
    }
}
