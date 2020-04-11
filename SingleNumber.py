"""
Time Complexity : O(N) for Bitwise Approach
Space Complexity : O(1) for all operations
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach

The problem asks to find single non repeating numbers in list
There are multiple approaches to solve this problem

1. HashMap/Dictionary/UnorderedMap
 Stores count of numbers in HashMap/Dictionary/UnorderedMap.Traverse
 HashMap/Dictionary/UnorderedMap to find number with count 1

 Time Complexity - O(N)
 Space Complexity - O(N)

2. Set
The above approache is based on counting and finding number.
Instead we can maintain set to store unique number.The set will only store
unique number

Time Complexity - O(N)
Space Complexity - O(N)

3. Bitwise Xor
The above two approaches works in O(N) space time.To reduce complexity,
we can apply bitwise xor operation on all the numbers.The duplicate numbers
cancel each other and non duplicate number will not get cancel out


Time Complexity - O(N)
Space Complexity - O(1)

Limitations
The Bitwise XOR is perfectly fine for finding one or two single frequency numbers.
If we are asked to find all single frequency numbers,then methods described in
approach (1) and (2) will be best suited
"""


class Solution:
    def __init__(self):
        super().__init__()

    def singleNumber(self, nums) -> int:
        once = 0;
        for num in nums:
            once = once ^ num
        return once


nums = [4,1,2,1,2]
sol = Solution()

once = sol.singleNumber(nums)
print(once)