package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static List<Interval> result  = new ArrayList<>();
    public static List<Interval> merge(List<Interval> intervals) {

        if(intervals==null || intervals.size()==0) return result;

        int n =intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];

        for(int i=0; i<n; i++){
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int k=0;
        int i=0;

        while(i<n-1){
            Interval i1=null;
            if(!(ends[i] <= ends[i+1] && starts[i+1]<=ends[i]) ){
                i1 =new Interval(starts[k],ends[i]);
                result.add(i1);
                if(i==n-2) {
                    i1 =new Interval(starts[i+1],ends[i+1]);
                    result.add(i1);
                }
            }
            else{
                while( i<n-1 && ends[i] <= ends[i+1] && starts[i+1]<=ends[i]){
                    i1 = new Interval(starts[k],ends[i+1]);
                    i++;
                }
                result.add(i1);
                if(i==n-2) {
                    i1 =new Interval(starts[i+1],ends[i+1]);
                    result.add(i1);
                }
            }

            i++;
            k=i;
        }
        return result;
    }

    public static void main(String[] args){
//        Interval i1= new Interval(1,3);
//        Interval i2= new Interval(2,6);
        Interval i3= new Interval(8,10);
        Interval i4= new Interval(15,18);
        Interval i1= new Interval(1,4);
        Interval i2= new Interval(4,5);


        List<Interval> intervals = new ArrayList<>();
        intervals.add(i1);
        intervals.add(i2);
      //  intervals.add(i3);
      //  intervals.add(i4);
        System.out.println(merge(intervals).toString());
    }
}
