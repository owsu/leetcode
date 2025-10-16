class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for val in nums:
            if val in hashset:
                return True
            else:
                hashset.add(val)
        return False

# Basically we make a set and we loop through the list adding it into the set. Now if it already exists in the set we know its a duplicate and we return true
# if we loop through the whole list then there is no duplicates and we return False. Worse case scenario it loops through the entire list and creates an
# entirely new one so this is O(n) time and space complexity. In terms of code lengthh I can definitely improve this code if I compare the list and set lengths.
