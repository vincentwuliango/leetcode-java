package easy;

/**
 * 121. Best Time to Buy and Sell Stock
 */

public class LC121 {
    void main() {
        int[] prices = new int[] {2,1,2,1,0,1,2};
        IO.println(maxProfit(prices));
    }
    
    public int maxProfit(int[] prices) {
        int currentProfit = 0, maxProfit = 0;
        int left = 0;
        
        for (int right = 0; right < prices.length; right++) {
            if (prices[left] < prices[right]) {
                currentProfit = prices[right] - prices[left];
            } else if (prices[left] > prices[right]) {
                prices[left] = right;
                left++;
            }
            
            if(maxProfit < currentProfit || maxProfit == 0) {
                maxProfit = currentProfit;
            }
        }
        
        return maxProfit;
    }
}
