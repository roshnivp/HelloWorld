package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoCompleteSystem {
    class Node{
        String sentence;
        int time;
        Node(String s, int t){
            sentence=s;
            time=t;
        }
    }

    class Trie{
        int time;
        Trie[] links= new Trie[27];
    }

    Trie root;
    public AutoCompleteSystem(String[] sentences, int[] times) {
        root= new Trie();
        for(int i=0;i<sentences.length;i++){
            insert(root,sentences[i],times[i]);
        }

    }

    String current="";
    public List<String> input(char c) {
        List<String> result = new ArrayList<>();
        if(c=='#'){
            insert(root,current,1);//insert splace
            current="";
        }
        else{
            current+=c;
            List<Node> list = search(root,current);
            Collections.sort(list,(a,b)->a.time==b.time?a.sentence.compareTo(b.sentence):b.time-a.time);
            for(int i=0;i<Math.min(3,list.size());i++){
                result.add(list.get(i).sentence);
            }
        }
        return result;
    }

    public List<Node> search(Trie t,String s){
        List<Node> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int indx = getInt(c);
            if(t.links[indx]==null) return new ArrayList<Node>();
            t=t.links[indx];
        }
        traverse(t,s,list);
        return list;
    }

    public void traverse(Trie t,String s,List<Node> list){
        if(t.time>0){
            list.add(new Node(s,t.time));
        }
        for(char c='a';c<='z';c++){
            if(t.links[c-'a']!=null){

                traverse(t.links[c-'a'],s+c,list);
            }
        }
        if(t.links[26]!=null){
            traverse(t.links[26],s+' ',list);
        }

    }

    public void insert(Trie t,String s,int time){
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            int indx = getInt(c);
            if(t.links[indx]==null){
                t.links[indx]=new Trie();
            }
            t = t.links[indx];
        }
        t.time+=time;
    }

    public int getInt(char c){
        return c == ' ' ? 26 : c - 'a';
    }



    public static void main(String[] args){
        String[] sentences= new String[]{"abc","adc","bcd","ade"};
        int[] times=new int[]{5,6,8,2,10};
         AutoCompleteSystem obj = new AutoCompleteSystem(sentences, times);
         List<String> param_1 = obj.input('a');
         System.out.println(param_1.toString());
    }


}
