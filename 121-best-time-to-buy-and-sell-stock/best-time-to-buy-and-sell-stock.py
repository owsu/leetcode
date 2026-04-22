class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        U - They want us to figure out the most amount of profit an array has. The greatest integer difference between two indexes (positive)
        P - Have a profit, see if i - previous > profit. Iterate.
        I - 
        """
        max_profit = 0
        best_price = prices[0]
        for i in range(1, len(prices)):
            difference = prices[i] - best_price
            if difference > max_profit:
                max_profit = difference
            else:
                if prices[i] < best_price:
                    best_price = prices[i]

        return max_profit

        