package LeetCode;

import java.util.Arrays;

public class MinMeetingRooms {
    public static int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for(int i=0; i<starts.length; i++) {
            if(starts[i]<ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }
    public static void main(String[] args){
        Interval i1= new Interval(0,30);
        Interval i2= new Interval(15,25);
        Interval i3= new Interval(15,20);


        Interval[] intervals = new Interval[]{i1,i2,i3};
        System.out.println(minMeetingRooms(intervals));
    }
}

 class Interval {
     int start;
     int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
 }
