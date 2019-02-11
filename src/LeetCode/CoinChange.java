package LeetCode;

import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] numberOfCoins = new int[amount + 1];
        Arrays.fill(numberOfCoins, Integer.MAX_VALUE);
        numberOfCoins[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (numberOfCoins[i - coin] != Integer.MAX_VALUE) {
                    numberOfCoins[i] = Math.min(numberOfCoins[i], numberOfCoins[i - coin] + 1);
                }
            }
        }
        return numberOfCoins[amount] == Integer.MAX_VALUE ? -1 : numberOfCoins[amount];
    }

    public static void main(String[] args){
        System.out.println(coinChange(new int[]{1,5,8},10));
    }
}
