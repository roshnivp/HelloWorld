package LeetCode;

public class IsSelfCrossing {
    public static boolean isSelfCrossing(int[] x) {
        int n = x.length;
        if(n<=3)return false;
        int base =0;
        int i=0;

        while(i+4<=n){
            if(x[i]-x[i+2]>=0 && x[i+1]-x[i+3]<=base) return true;
            else if(x[i+1]-x[i+3] >base) base =0;
            else{
                base=x[i];
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isSelfCrossing(new int[]{1,2,1,1,3}));
    }

}
