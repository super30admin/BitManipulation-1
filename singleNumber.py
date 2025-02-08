# Time: O(n)
# Space:O(1)
# Leetcode:Yes
# Issues:No


# bitwise xor
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for i in nums:
            result = result ^ i         # a xor b
        return result
    


# hashmap O(n) space

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hmap = set()

        for i in nums:
            if i in hmap:
                hmap.remove(i)
            else:
                hmap.add(i)

        return list(hmap)[0]