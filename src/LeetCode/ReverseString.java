package LeetCode;

public class ReverseString {
    public String reverseString(String s) {

        if(s.length()==0) return "";
        if(s.length()==1 ) return s;

        char[] str= s.toCharArray();
        reverse(str);
        return new String(str);

    }

    public void reverse(char[] str){
        int i= 0;
        int j = str.length-1;
        while(i<j){
            if(str[i]!=str[j]){
                swap(str,i,j);
            }
            i++;
            j--;
        }
    }

    public void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j]=temp;
    }
    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("abcd"));

    }
}
