package PracticeQstns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 19/09/16.
 */
public class StringPermutation {

    List<String> getAllPermutations(String str) {
        // Create a hash set to prevent any duplicate entries

        List<String> results = new ArrayList<>();
        getAllPermutations("",str,results);
        return  results;

    }
    void  getAllPermutations(String prefix, String suffix, List<String> results){

        if(suffix.length()==0){
            if (!results.contains(prefix))
            results.add(prefix);
        }

        else {
            for(int i=0; i<suffix.length(); i++){
                getAllPermutations(prefix+suffix.charAt(i), suffix.substring(0,i)+suffix.substring(i+1,suffix.length()), results);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = new ArrayList<>();
        StringPermutation sp= new StringPermutation();
        permutations =  sp.getAllPermutations(str);
        for(int i=0; i<permutations.size(); i++) {
            System.out.println(permutations.get(i));
        }
    }
}
