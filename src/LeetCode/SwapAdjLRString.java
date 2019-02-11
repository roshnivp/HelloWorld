package LeetCode;

public class SwapAdjLRString {
    public static boolean canTransform(String start, String end) {

        if(start.length()!=end.length())return false;

        int n= start.length();
        int i=0; //iterate over start
        int j=0; //iterate over end

        while(i<n && j<n){

            while(i<n && start.charAt(i)=='X')i++;
            while(j<n && end.charAt(j)=='X')j++;

            if(i<n && j<n){
                char chStart = start.charAt(i);
                char chEnd = end.charAt(j);
                if(chStart!=chEnd  || (chStart=='L'&& i<j) || (chStart=='R'&& i>j)){
                    return false;
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(start.charAt(i)!='X')return false;
            i++;
        }
        while(j<n){
            if(end.charAt(j)!='X')return false;
            j++;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(canTransform("XXRXXLXXXX","XXXRXLXXX"));
    }

}
