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
