package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 15/11/17.
 */
// Java program to find palindromic substrings of a string

public class PallindromeSubString
{
    // Returna total number of palindrome substring of
    // length greater then equal to 2
    static int CountPS(String s, int n)
    {

        //int n= s.length();

        if(n==0) return 0;

        int count=0;

        boolean[][] isPallindrome = new boolean[n][n];

        for(int i=0; i<n; i++){
            isPallindrome[i][i] =true;
            count++;
        }

        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                isPallindrome[i][i+1] = true;
                count++;
            }
        }

        for(int diff = 2; diff< n; diff++){
            for(int i=0; i<n-diff; i++){
                int j= i+ diff;

                if(s.charAt(i)==s.charAt(j) && isPallindrome[i+1][j-1]){
                    isPallindrome[i][j]=true;
                    count ++;
                }


            }
        }

        return count;

    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = "abc";
        System.out.println(CountPS(str, str.length()));
    }
}