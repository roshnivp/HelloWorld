package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwo {


    List<int[]> myBooking;//store the events
    List<int[]> overLaps;

    public MyCalendarTwo() {
        myBooking = new ArrayList<>();
        overLaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if(start<0 || end<0 || start >end) return false;//invalid inputs

        for(int[] overLap:overLaps){
            if(start<overLap[1] && overLap[0]<end){
                return false;
            }
        }

        for(int[] event:myBooking){
            if(event[0]<end && start<event[1]){
                overLaps.add(new int[]{Math.max(start,event[0]),Math.min(end,event[1])});
            }
        }
        myBooking.add(new int[]{start,end});
        return true;

    }

    public static void main(String[] args){
        MyCalendarTwo my = new MyCalendarTwo();
        System.out.println(my.book(5,15));
        System.out.println(my.book(10,20));
        System.out.println(my.book(12,15));

    }
}
