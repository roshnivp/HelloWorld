package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 31/01/18.
 */
public class StringReplace {
    static String solution(String S, int K) {
        // write your code in Java SE 8
        String str = S.replaceAll("-","");
        str = str.toUpperCase();
        //System.out.println(str);
        int n= str.length();
        int count =K;
        StringBuilder s = new StringBuilder(str);
        for(int i=n-1; i>=0; i--){

            if(K==0){

                s.insert(i+1,"-");
                K=count;
            }
            K--;


        }
        return s.toString();
    }
    public static void main(String[] args){
        System.out.print(solution("23-45-678",3));
    }
}
