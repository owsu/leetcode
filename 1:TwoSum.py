# Leetcode Easy Problem

# Basically what we are trying to find is if two numbers in the nums array add up to equal the target int.
# So what we do is create an empty dictionary and loop through the nums, if target - the num we are on is in the 
# dictionary then we know those two numbers add up to equal the target so we return both of the indexes. Otherwise
# we set the number as a key to put the index in the dictionary and move on. O(n) space and time complexity.

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict = {}

        for i, num in enumerate(nums):
            diff = target - num
            if diff in myDict:
                return [myDict[diff], i]
            myDict[num] = i
        
        return [-1]
