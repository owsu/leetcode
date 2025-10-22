


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        for char in strs:
            sortedChar = "".join(sorted(char))
            if sortedChar in hashMap:
                hashMap[sortedChar] += [char]
            else:
                hashMap[sortedChar] = [char]
        output = []
        for key in hashMap:
            output += [hashMap[key]]
        return output
