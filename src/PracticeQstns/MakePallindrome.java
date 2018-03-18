package PracticeQstns; /**
 * Created by Roshni Velluva Puthanidam on 6/30/16.
 */

import java.util.*;

public class MakePallindrome {
    private static String makePalindromeOfAll(String string) {
        String palindromeString = "";

        if (string.isEmpty()) {
            return null;
        }

        return makePalindrome(string);
    }


    public static String makePalindrome(String string) {
        if (string.length() == 1) {
            return string;
        }

        char[] characters = string.toCharArray();
        Arrays.sort(characters);
        StringBuffer startString = new StringBuffer();
        StringBuffer endString = new StringBuffer();
        int uniqueCharacterCount = 0;
        int oddCharacterIndex = 0;

        if (characters.length % 2 == 0) {
            for (int i = 0; i < characters.length; i += 2) {
                if (characters[i] != characters[i + 1]) {
                    return null; // not a palindrome
                }
                startString.append(characters[i]);
                endString.append(characters[i + 1]);
            }
            return startString.append(endString.reverse()).toString();
        } else {
            for (int i = 0; i < characters.length; i += 2) {
                if (characters[i] != characters[i + 1]) {
                    oddCharacterIndex = i;

                    i--;
                    uniqueCharacterCount++;
                } else {
                    startString.append(characters[i]);
                    endString.append(characters[i + 1]);
                }
                if (uniqueCharacterCount > 1) {
                    return null;
                }
            }
        }

        //now, make a palindrome string
        StringBuilder sb = new StringBuilder();
        sb.append(startString);
        sb.append(String.valueOf(characters[oddCharacterIndex]));
        sb.append(endString.reverse());
        return sb.toString();
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        String[] arr={"aavvddffggsrs","aavdffggsrs","ddffsscch"};
//        for(int i=0;i<arr.length;i++){
//            String newString = makePalindromeOfAll(arr[i]);
//            System.out.println(newString);
//        }
        List<String> stringList = new ArrayList<>();
        int i = 0;
        while (i < 3) {
            System.out.print("Enter string: ");
            stringList.add(scanner.next());
            i++;
        }
        for (int j = 0; j < 3; j++) {
            String newString = makePalindromeOfAll(stringList.get(j));
            System.out.println(newString);
        }
    }
}
