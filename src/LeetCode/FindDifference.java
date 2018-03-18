package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 16/01/18.
 */
public class FindDifference {
    static char findTheDifference(String s, String t) {
        for(int i =0; i<t.length(); i++){
            if(s.isEmpty()) return t.charAt(t.length()-1);
            if(s.contains(String.valueOf(t.charAt(i)))){
                if(s.length()==1) s = new String("");
                else s = s.substring(0,i)+s.substring(i+1,s.length());
                System.out.println(s.length());
            }
            else{
                return t.charAt(i);
            }


        }
        return ' ';

    }
    public static void main(String[] args){
        System.out.print(findTheDifference("aa","aab"));
    }
}
