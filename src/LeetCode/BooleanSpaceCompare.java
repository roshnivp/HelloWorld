package LeetCode;

public class BooleanSpaceCompare {

    static boolean backspaceCompare(String S, String T) {


        StringBuilder str1 = new StringBuilder(S);
        StringBuilder str2 = new StringBuilder(T);


        for(int i=0; i<str1.length(); i++){
            if(i>0 && str1.charAt(i) == '#'){
                str1.deleteCharAt(i-1);
                str1.deleteCharAt(i-1);
                i=i-2;

            }
        }

        for(int k=0; k<str2.length(); k++){
            if(k>0 &&  str2.charAt(k) == '#'){
                str2.deleteCharAt(k-1);
                str2.deleteCharAt(k-1);
                k=k-2;

            }
        }
        String s1 = str1.toString();
        String s2 = str2.toString();
        s1 = s1.replaceAll("#","");
        s2= s2.replaceAll("#","");

        if(s1.isEmpty() && s2.isEmpty()) return true;
        return s1.equals(s2);
    }


    public static void main(String[] args){
        String S ="y#fo##f" ;
        String T ="y#f#o##f";
        System.out.println(backspaceCompare(S,T));
    }


}
