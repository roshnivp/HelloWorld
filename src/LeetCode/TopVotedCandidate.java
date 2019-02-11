package LeetCode;

import java.util.HashMap;
import java.util.TreeSet;

public class TopVotedCandidate {
    HashMap<Integer,Integer> cachedLeader= new HashMap<>();//time v/s top voted candidate at the moment
    TreeSet<Integer> set = new TreeSet<>(); //to get the floor of the time

    public TopVotedCandidate(int[] persons, int[] times) {
        int n = persons.length;
        int leader = -1;

        for(int time:times){
            set.add(time);
        }

        HashMap<Integer,Integer> votesCount= new HashMap<>();
        for(int i=0 ; i<n ;i++){
            votesCount.put(persons[i],votesCount.getOrDefault(persons[i],0)+1);
            Integer votes =votesCount.get(leader);

            if(votes==null || votes<=votesCount.get(persons[i])){
                leader = persons[i];//change the leader
            }

            cachedLeader.put(times[i],leader);
        }

    }

    public int q(int t) {
        int key = set.floor(t);
        return cachedLeader.get(key);
    }

    public static void main(String[] args){
        TopVotedCandidate obj = new TopVotedCandidate(new int[]{0,1,1,0,0,1,0},new int[]{0,5,10,15,20,25,30});
        int param_1 = obj.q(25);
        System.out.println(param_1);
    }
}
