package LeetCode;

public class MinCandy {
    public static int candy(int[] ratings) {
        if(ratings==null || ratings.length==0)return 0;
        if(ratings.length==1)return 1;
        int n = ratings.length;
        int[] leftNeighbour = new int[n];
        int[] rightNeighbour = new int[n];
        leftNeighbour[0]=1;
        rightNeighbour[n-1]=1;

        for(int i =1; i<n; i++){
            if(ratings[i]>ratings[i-1]){
                leftNeighbour[i]=leftNeighbour[i-1]+1;
            }
            else{
                leftNeighbour[i]=1;
            }
        }

        for(int i=n-2;i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                rightNeighbour[i]=rightNeighbour[i+1]+1;
            }
            else{
                rightNeighbour[i]=1;
            }
        }

        int sum =0;

        for(int i=0;i<n; i++){
            sum+=Math.max(leftNeighbour[i],rightNeighbour[i]);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(candy(new int[]{1,0,2}));
    }
}
