package PracticeQstns;
import java.util.*;
/**
 * Created by Roshni Velluva Puthanidam on 31/01/18.
 */
public class NumberNext {
    // you can also use imports, for example:


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        List<String> result = new ArrayList<>();
        public String solution(String S) {
            // write your code in Java SE 8
            if(S.equals("23:59")){
                return S;
            }
            String str= S.replaceAll(":","");
            int n = str.length();
            permuteString(str,0,n-1);
            List<Integer> withinRange = new ArrayList<>();
            List<Integer> outsideRange = new ArrayList<>();
            String ansMax="";
            String ansMin="";
            for(int i=0; i<result.size(); i++){

                String val = result.get(i);//.substring(0,2)
                Integer num = Integer.valueOf(S);//.substring(0,2)

                Integer ans =  Integer.parseInt(val);
                int min= Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                int abs = num -ans;
                if(num < ans && ans < 2400){
                    withinRange.add(ans);

                    if(min > abs && abs >0 ){
                        min = abs;
                        ansMin = String.valueOf(ans);
                    }


                }
                else{
                    outsideRange.add(ans);
                    if(max<abs){
                        max = abs;
                        ansMax= String.valueOf(ans);
                    }

                }
            }
            if(!withinRange.isEmpty()) return ansMin;
            return ansMax;

        }


        void permuteString(String str,int i,int n){
            char[] strChar =str.toCharArray();
            char temp=' ';
            if(i==n){
                if(!result.contains(str)) result.add(str);


            }
            else{
                for(int j=i; j<=n; j++){
                    temp= strChar[i];
                    strChar[i] = strChar[j];
                    strChar[j]= temp;
                    String s = String.valueOf(strChar);
                    permuteString(s,i+1,n);
                    temp= strChar[i];
                    strChar[i] = strChar[j];
                    strChar[j]= temp;
                }
            }

        }

        public static void main(String[] args){
            NumberNext n= new NumberNext();
            n.solution("11:00");
        }

}
