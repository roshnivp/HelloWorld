package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class ExcelSheetColumnTitle {
    static String convertToTitle(int n) {
        if(n == 0)
            return "";
        else{
            return convertToTitle(--n/26)+(char)('A'+(n%26));
        }

    }
    public static void main(String[] args){
        System.out.println(convertToTitle(57));
        System.out.println(convertToNumber("CDE"));
    }
    static int convertToNumber(String s){
        int result=0;

        for(int i=0; i<s.length(); i++){
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
