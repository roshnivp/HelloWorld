package LeetCode;


public class GetHint {
    public static String getHint(String secret, String guess) {
        int A_count =0;
        int B_count =0;
        int[] sCount=new int[10];
        int[] gCount=new int[10];
        for(int i=0; i< secret.length();i++ ){
            if(secret.charAt(i)==guess.charAt(i))A_count++;
            else{
                sCount[secret.charAt(i)-'0']++;
                gCount[guess.charAt(i)-'0']++;
            }
        }

        for(int i=0;i<10;i++){
            B_count+=Math.min(sCount[i],gCount[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A_count).append('A').append(B_count).append('B');
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(getHint("1808","7810"));
    }
}
