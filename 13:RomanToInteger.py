class Solution:
    def romanToInt(self, s: str) -> int:
        hM = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        output = 0
        for i in range(len(s)):
            if i < len(s)-1 and hM[s[i]] < hM[s[i+1]]:
                output -= hM[s[i]]
            else:
                output += hM[s[i]]
        return output


        
