#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def singleNumber3(self, nums: List[int]) -> int:
      bm = 0
      for n in nums:
          bm ^= n

      diff = bm & (-bm)

      bm1 = 0
      for n in nums:
          if diff & n != 0:
              bm1 ^= n

      return [bm1, bm1 ^ bm]
