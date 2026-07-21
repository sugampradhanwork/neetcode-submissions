class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        while(right < prices.length) {
            int diff = prices[right] - prices[left];
            if(diff > 0) {
                profit = Math.max(profit, diff);
            } else {
                left = right;
                
            }
            right++;
        }
        return profit;


        /* brute force
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if( diff > 0) {
                    max = Math.max(max, diff);
                }
            }
        }
        return max;
        */
    }
}
