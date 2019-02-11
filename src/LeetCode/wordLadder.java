package LeetCode;

import java.util.*;

public class wordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList==null || wordList.size()==0)return 0;
        HashSet<String> set= new HashSet<>(wordList);
        Queue<String> que = new LinkedList<>();
        int noOfTrans =1;

        que.add(beginWord);

        while(!que.isEmpty()){
            int size = que.size();

            for(int i = 0; i < size; i++) {
                String curr = que.poll();
                if(curr.equals(endWord)) return noOfTrans;
                char[] chars = curr.toCharArray();
                for(int j = 0; j < curr.length(); j++) {
                    for(char ch = 'a'; ch <= 'z'; ch++) {
                        chars[j] = ch;
                        String sb = new String(chars);
                        if(set.contains(sb)) {
                            que.offer(sb);
                            set.remove(sb);
                        }
                        else if(ch=='z'){
                            chars[j]=curr.charAt(j);
                        }
                    }
                }
            }
            noOfTrans++;

        }
        return 0;
    }
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("hot");
        ls.add("dot");
        ls.add("dog");
        ls.add("lot");
        ls.add("log");
        ls.add("cog");
        System.out.println(ladderLength("hit","cog",ls));
    }

}
