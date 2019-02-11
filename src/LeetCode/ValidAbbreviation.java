package LeetCode;

public class ValidAbbreviation {
    public static boolean validWordAbbreviation(String word, String abbr) {
           int m = word.length();
           int n= abbr.length();
           if(n>m)return false;

           int i=0; //word pointer
           int j=0; //abbr pointer

        while(i<m && j<n){

            int noOfSkips = 0;
            if(abbr.charAt(j)-'0'==0)return false;

            while(j<n && Character.isDigit(abbr.charAt(j))){
                noOfSkips = noOfSkips*10+(abbr.charAt(j)-'0');
                j++;
            }
            i +=noOfSkips;
            if(i>=m)break;
            if(j>=n)break;
            if(word.charAt(i)!=abbr.charAt(j))return false;
            i++;
            j++;
        }
        return i==m && j==n;

    }
    public static void main(String[] args){
        System.out.println(validWordAbbreviation("internationalization","i5a11o1"));
    }
}
