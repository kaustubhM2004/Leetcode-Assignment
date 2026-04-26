import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }

        return profit;
    }
}

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int ans = new Solution().maxProfit(prices);

        System.out.println(ans);
    }
}