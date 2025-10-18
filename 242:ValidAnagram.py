# Leetcode Easy Problemm

# Basically what this code does is that it basically converts the two strings into dictionaries
# then it checks to see if the dictionary has the same key. if it does then it contains the letter
# if it doesn't then it isn't a valid anagram. This is O(n) time complexity and O(n) space complexity
# though the sorted method that is way shorter is O(1) space but O(nlogn) time so its picking your poison.

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # return sorted(s) == sorted(t)
        if len(s) != len(t):
            return False
        
        hS, hT = {}, {}
        for i in range(len(s)):
            hS[s[i]] = 1 + hS.get(s[i], 0)
            hT[t[i]] = 1 + hT.get(t[i], 0)

        for key in hS:
            if hS[key] != hT.get(key, 0):
                return False
        return True
        
