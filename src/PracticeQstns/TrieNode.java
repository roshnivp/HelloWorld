package PracticeQstns;

class TrieNode {

    private TrieNode[] links;
    private final int R = 26; //max 26 links possible from each node

    private boolean isEnd;//refers end of the word or just prefix

    public TrieNode(){
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    public TrieNode get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch,TrieNode node){
        links[ch-'a']=node; //initialize new links from ch
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}

class Trie
{
    public TrieNode root;

    public Trie(){
        root= new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;

        for(int i=0; i<word.length();i++){
            char current = word.charAt(i);
            if(!node.containsKey(current)){
                node.put(current,new TrieNode());
            }
            node = node.get(current);
        }
        node.setEnd();
    }

    private TrieNode searchPrefix(String word){
        TrieNode node = root;
        // search a prefix or whole key in trie and
        // returns the node where search ends
        for(int i=0; i<word.length();i++) {
            char letter = word.charAt(i);
            if(node.containsKey(letter)){
                node = node.get(letter);
            }
            else{
                return null;
            }
        }
        return node;

    }

    // Returns if the word is in the Trie
    public boolean search(String word){
        TrieNode node = searchPrefix(word);
        return node!=null && node.isEnd();
    }

    //Search for a prefix
    // Returns if there is any word in the trie
    // that starts with the given prefix.

    public boolean startsWith(String prefix){
        TrieNode node = searchPrefix(prefix);
        return node!=null;
    }



}