# Time Complexity : O(n) where n is length of nums
# Space Complexity :O(n)  where n is length of nums
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


import collections
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #created dictionary of the counts
        cnt = collections.Counter(nums)
        #in the dictionary if a number doesnt apper 2 times then return that number
        for i,c in cnt.items() :
            if c!= 2:
                return i
