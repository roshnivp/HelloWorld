package LeetCode;

import java.util.TreeSet;

public class ExamRoom {
    TreeSet<Integer> set;//keep track of occupied seats
    int n;
    public ExamRoom(int N) {
        n = N;
        set = new TreeSet<>();
    }

    public int seat() {
        if(set.size()==0){//if no one is in the room
            set.add(0);
            return 0;
        }
        int result =-1;
        int left =0;
        int currentDist=0;
        int distance =0;
        for(int seat:set){
            currentDist = (seat-left)/2;
            if(currentDist>distance){
                distance =currentDist;
                result = left+distance;
            }
            left = seat;
        }


        if(!set.contains(n-1)){ //if last position is not occupied
            currentDist = n-1-(set.floor(n-1));
            if(currentDist>distance){
                distance = currentDist;
                result = n-1;
            }

        }

        if(!set.contains(0)){//if first pos is not occupied
            currentDist = set.ceiling(0);
            if(currentDist>=distance){
                distance = currentDist;
                result = 0;
            }
        }
        set.add(result);
        return result;
    }

    public void leave(int p) {
        set.remove(p);
    }
    public static void main(String[] args){
        ExamRoom room = new ExamRoom(10);
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        System.out.println(room.seat());
        room.leave(4);
        System.out.println(room.seat());


    }
}
