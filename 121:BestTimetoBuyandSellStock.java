/* LeetCode Easy Problem
Basically we want to buy high and sell low. So what we do is create a sliding window where if there is a profit we store it and if there is not
Then we move the start window to wherever that chain broke off (which is the end variable). This is just 1 for loop and there is no storage
variables so we are looking at O(n) time complexity and O(1) space
*/


class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int output = 0;

        for (int end = 0; end < prices.length; ++end) {
            if (prices[end] > prices[start]) {
                int difference = prices[end] - prices[start];

                if (difference > output) {
                    output = difference;
                }
            } else {
                start = end;
            }
        }
        
        return output;
    }
}
