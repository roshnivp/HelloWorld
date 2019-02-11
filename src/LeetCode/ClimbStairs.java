package LeetCode;

public class ClimbStairs {

    public static int climbStairs(int n) {
        if(n==0 || n==1)return n;

        int[] climbs= new int[n+1];
        climbs[1]=1;
        climbs[2]=2;
        //at any point i, it can take single step from i-1 or 2 steps from i-2;

        for(int i=3; i<=n; i++){
            climbs[i] = climbs[i-1]+climbs[i-2]; //no of ways single step can take + no of ways two steps can take.
        }

        return climbs[n];
    }

    public static void main(String[] args){
        System.out.println(climbStairs(7));
    }
}
