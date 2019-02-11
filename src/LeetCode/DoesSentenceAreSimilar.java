package LeetCode;

import java.util.HashSet;

public class DoesSentenceAreSimilar {

    public static boolean AreSentencesAreSim(String[] words1,String[] words2,String[][] pairs){
        if(words1.length!=words2.length)return false;

        HashSet<String> set = new HashSet<>();

        for(String[] pair:pairs){
            set.add(pair[0]+" "+pair[1]);
        }

        for(int i=0; i<words1.length;i++){

            if(!words1[i].equals(words2[i]) && !set.contains(words1[i]+" "+words2[i]) && !set.contains(words2[i]+" "+words1[i]) ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String[] words1 = new String[]{"great","words","thank","you"};
        String[] words2 = new String[]{"fine","words","great","you"};
        String[][] pairs = new String[][]{{"fine","great"},{"great","fine"}};
        System.out.println(AreSentencesAreSim(words1,words2,pairs));
    }
}
