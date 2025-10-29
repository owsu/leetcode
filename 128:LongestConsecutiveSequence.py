# Leetcode Medium Program

# What we are trying to do is find the longest consecutive sequence in an array, so what we do is that if the length is 0 we return 0 (obviously)
# then we convert nums into a set to get rid of extraneous sumbers and loop through the set and  making sure that we ignore starting the second
# loop off on numbers we do not need to. Then we start a second loop and everytime we see that the next number is larger we increase our length
# and store the maximum of the 2 values to our ML which we return at the end. This is obviously N^2 time complexity at its worse and O(N) space complexity

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        ML = 0
        NS = set(nums)
        for num in NS:
            if num - 1 not in NS:
                current = num
                L = 1

                while current + 1 in NS:
                    L += 1
                    current += 1
                ML = max(ML, L)
                

            

        return ML
