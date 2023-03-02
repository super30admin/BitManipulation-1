# TimeComplexity: O(n)
# SpaceComplexity: O(n)

class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        sett = set()
        res = set()
        for i in range(len(s)-9):
            sub = s[i:i+10]
            if sub in sett:
                res.add(sub)
            sett.add(sub)
        return res
