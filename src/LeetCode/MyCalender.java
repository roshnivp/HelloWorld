package LeetCode;

import java.util.TreeMap;

public class MyCalender {

    TreeMap<Integer,Integer> map;

    public MyCalender(){
        map = new TreeMap<>();
    }

    public boolean book(int start,int end){
        Integer prevBook = map.floorKey(start);
        Integer nextBook = map.ceilingKey(start);

        if((prevBook==null || map.get(prevBook)<=start) &&((nextBook==null || nextBook>=end))){
            map.put(start,end);
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        MyCalender cal = new MyCalender();
        System.out.println(cal.book(20,30));
        System.out.println(cal.book(10,30));
        System.out.println(cal.book(25,30));
    }
}
