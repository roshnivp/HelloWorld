package LeetCode;


import java.util.*;

public class RepeatedSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if(s.length()==0) return result;

        Map<String,Integer> repMap= new LinkedHashMap<>();

        for(int i=0; i+10<=s.length(); i++){
            String str = s.substring(i,i+10);
            if(repMap.containsKey(str)){
                repMap.put(str,repMap.get(str)+1);
                result.add(str);
            }
            else{
                repMap.put(str,1);

            }
        }


        return new ArrayList<>(new HashSet<>(result));
    }
    public static void main(String[] args){
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAA").toString());
    }
}
