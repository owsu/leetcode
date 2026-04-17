class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        if not s:
            return 0

        w = s.split(" ")
        out = []
        for word in w:
            if not word.isspace() and not len(word) == 0:
                out.append(word)
                
        print(out)
        return len(out[-1])