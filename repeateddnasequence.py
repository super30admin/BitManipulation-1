#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        seen = set()
        ans = set()
        n = len(s)

        for i in range(n - 9):
            if s[i:i + 10] in seen:
                ans.add(s[i:i + 10])
            seen.add(s[i:i + 10])

        return list(ans)

