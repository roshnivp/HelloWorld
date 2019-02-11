package LeetCode;

public class LicenceKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        if(S==null || S.length()==0 || K==0)return "";
        StringBuilder sb = new StringBuilder();

        S= S.toUpperCase();
        int i= S.length()-1;
        int k=0;

        while(i>=0){
            char c = S.charAt(i);

            if(c!='-'){
                if(k<K){
                    sb.append(c);
                    k++;
                }
                else{
                    k=0;
                    sb.append("-");
                    sb.append(c);
                    k++;
                }
            }


            i--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",3));
    }
}
