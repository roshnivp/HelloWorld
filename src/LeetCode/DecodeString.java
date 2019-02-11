package LeetCode;

public class DecodeString {
    private static  int i = 0;
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while(i<s.length()){
            char c= s.charAt(i);

            if(Character.isDigit(c)){
                num = num * 10 + c - '0';
            }
            else if(c=='['){
                i++;
                String str = decodeString(s);
                for(int k=0;k<num; k++) sb.append(str);
                num =0;
            }
            else if(c==']'){
                return sb.toString();
            }
            else{
                sb.append(c);
            }
            i++;
        }

        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(decodeString("3[a2[c]]"));
    }
}
