package LeetCode;

import java.util.*;

public class WordAbbreviation {
    public List<String> wordsAbbreviation(List<String> dict) {
        String[] res = new String[dict.size()];
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < dict.size(); i++) {
            String key = abbre(dict.get(i), 0);
            if (!map.containsKey(key)) map.put(key, new ArrayList<Integer>());
            map.get(key).add(i);
        }

        for (String key : map.keySet()) {
            if (map.get(key).size() == 1) {
                res[map.get(key).get(0)] = key;
            } else {
                solveWithTrie(res, dict, map.get(key));
            }
        }
        return Arrays.asList(res);
    }

    public String abbre(String str, int i) {
        int len = str.length();
        if (len - i <= 3) return str;
        return str.substring(0, i + 1) + Integer.toString(len - i - 2) + str.charAt(len - 1);
    }

    public void solveWithTrie(String[] res, List<String> dict, List<Integer> pos) {
        Trie trie = new Trie();
        for (Integer index : pos) {
            trie.insert(dict.get(index));
        }

        for (Integer index : pos) {
            int i = trie.uniquePrefix(dict.get(index));
            //System.out.println(dict.get(index) + " " + i);
            String abb = abbre(dict.get(index), i);
            res[index] = abb;
        }
    }

    class TrieNode {
        int count;
        Map<Character, TrieNode> children;
        TrieNode() {
            count = 0;
            children = new HashMap<Character, TrieNode>();
        }
    }

    class Trie {
        TrieNode root;
        Trie() {
            root = new TrieNode();
        }

        public void insert(String str) {
            TrieNode runner = root;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!runner.children.containsKey(c)) runner.children.put(c, new TrieNode());
                runner = runner.children.get(c);
                runner.count++;
            }
        }

        public int uniquePrefix(String str) {
            TrieNode runner = root;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                runner = runner.children.get(c);
                if (runner.count == 1) return i;
            }
            return -1;
        }
    }
    public static void main(String[] args){
        String[] arr = new String[]{"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"};
        WordAbbreviation w= new WordAbbreviation();
        System.out.println(w.wordsAbbreviation(Arrays.asList(arr)).toString());
    }
}
