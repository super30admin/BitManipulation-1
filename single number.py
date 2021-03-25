"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Explaination
XOR :
0 xor 0 -> 0
0 xor 1 -> 1
1 xor 0 -> 1
1 xor 1 -> 0

we use bitmask here 
if we xor with same number we get 0 
hence if xor 1 with 1 it will be 0
after xoring over array we will be left wiht single number


"""
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for i in nums:
            bitmask = bitmask^i
        return bitmask
        