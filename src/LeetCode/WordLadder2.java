package LeetCode;

import java.util.*;

public class WordLadder2 {
    List<List<String>> res = new ArrayList<>();
    Queue<String> q = new LinkedList<>();
    HashMap<String,Set<String>> map =new HashMap<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);

        q.add(beginWord);
        int path =1;

        numOfLadder(set,endWord,path);
        List<String> cur = new ArrayList<>();
        cur.add(beginWord);
        getPath(beginWord,endWord,map,cur);
        return res;



    }

    void getPath(String start, String end, Map<String, Set<String>> g, List<String> cur) {
        if(start.equals(end)) {
            res.add(new ArrayList<>(cur));
            return;
        }

        if(!g.containsKey(start)) return;

        for(String nxt : g.get(start)) {
            cur.add(nxt);
            getPath(nxt, end, g, cur);
            cur.remove(cur.size() - 1);
        }
    }

    public void numOfLadder( HashSet<String> set, String endWord, int path){
        while(!q.isEmpty()){
            int size = q.size();


            for(int i=0;i<size;i++){
                String s = q.poll();

               // if(s==endWord) return;
                HashSet<String> ls = new HashSet<>();

                char[] charSet = s.toCharArray();
                for(int j=0; j<s.length(); j++){
                    for(char ch='a';ch<='z';ch++){
                        charSet[j]=ch;
                        String str = new String(charSet);
                        if(set.contains(str)) {
                            ls.add(str);
                            q.add(str);
                            set.remove(str);
                        }
                        else if(ch=='z'){
                            charSet[j]=s.charAt(j);
                        }
                    }
                }
              //  System.out.println(ls.toString());

                map.put(s,ls);
            }
            path++;

        }
    }
    public static void main(String[] args) {
        WordLadder2 wl = new WordLadder2();
        List<String> ls = new ArrayList<>();
       // ls.add("hot");
        ls.add("dot");
        ls.add("dog");
        ls.add("lot");
        ls.add("log");
        ls.add("cog");
        System.out.println(wl.findLadders("hot","cog",ls));
    }
}
