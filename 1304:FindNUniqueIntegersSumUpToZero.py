# Leetcode Easy Problem

# Basically we are trying to find the biggest array of integers that still s um up to 0.
# So basically we..

class Solution:
    def sumZero(self, n: int) -> List[int]:
        answer = []
        for i in range(1, int(n/2) + 1):
            answer.append(i)
            answer.append(-i)
        if (n % 2 == 1):
            answer.append(0)
        
        return(answer)

        
