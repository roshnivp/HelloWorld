package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return result;
        String str ="";
        String[] letters =new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        DFS(0,str,letters,digits);

        return result;
    }

    public void DFS(int x,String str,String[] letters,String digits){
        String s = letters[Integer.valueOf(digits.substring(x, x+1))];
        for(int j = 0;j<s.length();j++) {
            String tmp = str;
            tmp = tmp + s.substring(j, j+1);
            if(x != digits.length()-1) {
                DFS(x+1, tmp, letters, digits);
            }else {
                result.add(tmp);
            }
        }
    }

    public static void main(String[] args){
        LetterCombination lc = new LetterCombination();
        System.out.println(lc.letterCombinations("32").toString());
    }
}
