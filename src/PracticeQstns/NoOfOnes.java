package PracticeQstns;

/**
 * Created by roshni on 6/15/16.
 */
public class NoOfOnes {
    public int getNumberOfOnes(int n) {
        if(n==0)
        {
        return 0;
        }
        else
        {
        return (n % 2) + getNumberOfOnes(n / 2);
        }
    }
    public static void main(String[] args){
        NoOfOnes n=new NoOfOnes();
        int d=n.getNumberOfOnes(7);
        System.out.println("No of ones is:"+d);
    }

}
