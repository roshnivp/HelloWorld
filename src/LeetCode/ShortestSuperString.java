package LeetCode;

public class ShortestSuperString {
    public static String shortestSuperstring(String[] A) {
        int n = A.length;

        while(n!=1){//Try to get max. overlapping substring n-1 time

            int max = 0;
            String res = "";
            int p = -1;
            int q = -1; //store the indexes of largest overlapping strings

            for (int i = 0; i < n-1; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    StringBuilder sb = new StringBuilder();

                    int len = getMaxOverLappingStrings(A[i],A[j],sb);
                    if(max<len){
                        max = len;
                        res=sb.toString();
                        p=i;
                        q=j;
                    }
                }
            }

            if(max==0){
                A[0] = A[0]+A[n-1];//if there is no common elements combine first and last elements
            }
            else{
                A[q]=res;
                A[p]=A[n-1];//copy last element to p position --> reduce the number of comparison to be done
            }
            n--; //reduce number of comparison by 1
        }
        return A[0];

    }

    public static int getMaxOverLappingStrings(String s1, String s2,StringBuilder sb){
        int max = 0;
        //compare the tail of s1 with head of s2
        int len = Math.min(s1.length(),s2.length());

        // check prefix of s2 matches with suffix of s1
        for(int i=1;i<=len;i++){
            if(s1.substring(s1.length()-i).equals(s2.substring(0,i))){
                if(max<i){
                    max=i;
                    sb.setLength(0);//clear the sb
                    sb.append(s1).append(s2.substring(i));
                }
            }
        }

        // check prefix of s1 matches with suffix of s2
        for(int i=1;i<=len;i++){
            if(s2.substring(s2.length()-i).equals(s1.substring(0,i))){
                if(max<i){
                    max=i;
                    sb.setLength(0);//clear sb;
                    sb.append(s2).append(s1.substring(i));
                }
            }
        }

        return max;

    }
    public static void main(String[] args){
        System.out.println(shortestSuperstring(new String[]{"fit","strip","profit"}));
    }

}
