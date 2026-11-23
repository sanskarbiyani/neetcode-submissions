class Solution {
    public int maxProfit(int[] prices) {
        int left=0, right=1;
        int n = prices.length;
        int maxProfit = 0;
        while (right<n){
            if(prices[right] >= prices[left]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            ++right;
        }
        return maxProfit;
    }
}
