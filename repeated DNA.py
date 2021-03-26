"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Explaination
use set to know if number is repeated
if repeated then add to res

"""
class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        k = set()
        res = set()
        for i in range(len(s)-9):
            if s[i:i+10] not in k:
                k.add(s[i:i+10])
            else:
                # if s[i:i+10] not in res:
                res.add(s[i:i+10])
        return list(res)