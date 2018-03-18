package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class AnagramOrNot {

    static boolean isAnagram(String word, String anagram){
        if(word==null || anagram==null) return false;

        char[] words= word.toCharArray();
        for(char c:words){
            int index= anagram.indexOf(c);
            if(index!=-1){
                anagram = anagram.substring(0,index) + anagram.substring(index+1);
            }
            else{
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static void main(String[] args){
        System.out.print(isAnagram("abcd","dceab"));
    }
}
