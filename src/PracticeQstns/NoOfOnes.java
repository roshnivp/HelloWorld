package PracticeQstns;

/**
 * Created by roshni on 6/15/16.
 */
public class NoOfOnes {
    public int getNumberOfOnes(int n) {
        if(n<=0) return 0;

        int[] countBits = new int[n+1];
        countBits[0]=0;
        countBits[1]=1;

        for(int i=2; i<=n; i++){
            countBits[i] =i%2==0?countBits[i/2]:countBits[i/2]+1;
        }
        return countBits[n];
    }
    public static void main(String[] args){
        NoOfOnes n=new NoOfOnes();
        int d=n.getNumberOfOnes(7);
        System.out.println("No of ones is:"+d);
    }

}
