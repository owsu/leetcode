class Solution:
    def reverse(self, x: int) -> int:
        x = str(x)
        output = ""
        isNegative = False
        for i in range(len(x)):
            currentChar = len(x) - (i+1)
            if x[currentChar] == "-":
                isNegative = True
            else:
                output += x[currentChar]
            
        if int(output) > (2**31) - 1 or int(output) < 2**-31:
            return 0
        output = int(output)
        if isNegative:
            output *= -1

        return output
            
