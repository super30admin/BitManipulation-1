# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def findRepeatedDnaSequences(self, s):
        toInt = {'A': 0, 'T': 1, 'G': 2, 'C': 3}
        if len(s) < 11:
            return []
        keys = {}
        ans = []
        key = 0
        mask = (1 << 20) - 1
        for i in range(9):
            key = (key << 2) + toInt[s[i]]

        for i in range(9, len(s)):
            key = ((key << 2) + toInt[s[i]]) & mask
            if key in keys:
                keys[key] += 1
                if keys[key] == 2:
                    ans.append(s[i - 9:i + 1])
            else:
                keys[key] = 1
        return ans
