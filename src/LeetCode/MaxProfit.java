package LeetCode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int n =prices.length;
        int maxProfit =0;
        int minPrice = Integer.MAX_VALUE;

        for(int i =0; i<n;i++){
            if(prices[i]<minPrice){
                minPrice =prices[i];
            }
            else if(prices[i] -minPrice >maxProfit ){
                maxProfit =prices[i] -minPrice;
            }
        }

        return maxProfit ;

    }

    public static int maxProfit2(int[] prices) {
        if(prices.length==0)return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        int maxCurrProfit =0;
        int n =prices.length;

        for(int i=0;i<n; i++){
            if(prices[i]<minPrice){
                minPrice =prices[i];
                i++;
                while(i<n && prices[i] >prices[i-1]){
                    maxCurrProfit = Math.max(maxCurrProfit,prices[i]-minPrice);
                    i++;
                }
                i--;
                maxProfit +=maxCurrProfit;
                maxCurrProfit =0;
                minPrice = Integer.MAX_VALUE;
            }

        }
        return maxProfit;
    }
    public static void main(String[] args){
        System.out.println(maxProfit2(new int[]{7,1,5,3,6,4}));
    }
}
