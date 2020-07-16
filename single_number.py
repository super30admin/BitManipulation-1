// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach:
we have the number which is a single number in a given list.
if we look at XOR function ,if we do xor on the same elemenst we get 0.if we do xor on 0 and some element then we get that element.
for example : XOR(3,3) --> 0
                XOR(0,2)--> 2 which is the single number present in a list.

# Time complexity --> o(n)
# space complexity --> o(1)
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a=0
        for i in nums:
            a=a^i
            # print(a)
        return a
        