package LeetCode;

import java.util.ArrayList;

public class PallindromePartition {
    ArrayList<ArrayList<String>> result = new ArrayList<>();
    public ArrayList<ArrayList<String>> partition(String s) {

        if (s == null || s.length() == 0) {
            return result;
        }

        ArrayList<String> partition = new ArrayList<>();//track each possible partition
        addPalindrome(s, 0, partition);

        return result;
   }

    private void addPalindrome(String s, int start, ArrayList<String> partition) {
        //stop condition
        if (start == s.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String str = s.substring(start, i);
            if (isPalindrome(str)) {
                partition.add(str);
                addPalindrome(s, i, partition);
                partition.remove(partition.size() - 1);
            }
        }
    }


    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        PallindromePartition pp = new PallindromePartition();
        System.out.println(pp.partition("aab").toString());
    }
}
