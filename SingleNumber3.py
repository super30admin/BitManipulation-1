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
 HashMap/Dictionary/UnorderedMap to find numbers with count 1

 Time Complexity - O(N)
 Space Complexity - O(N)

2. Set
The above approache is based on counting and finding number.
Instead we can maintain set to store unique numbers.The set will only store
unique numbers

Time Complexity - O(N)
Space Complexity - O(N)

3. Bitwise Xor
.
first run ^ to get the a^b
search the position to do partitioning in binary representation of a^b
partition the array by this position and get a and b correspondingly
e.g. [1,2,1,3,2,5]

1 = 001
2 = 010
1 = 001
3 = 011
2 = 010
5 = 101

after 1st step, we found out that a^b = 3^5 = 6 which is 110
110 means that there are 2 digits on the left are different in binary representation of our result
let's use any one of the digit to partition our array

if we use the middle one, we can see that there are 2 sets of numbers that we can just use the simple single number to find out the single in each partition
1 = 001
1 = 001
5 = 101 ✅
2 = 010
2 = 010
3 = 011 ✅

if we use the leftmost one, we can still partition the array into the sets and do simple single number on it
1 = 001
2 = 010
1 = 001
3 = 011✅
2 = 010
5 = 101✅
"""

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        output = set()
        for num in nums:
            if not num in output:
                output.add(num)
            else:
                output.remove(num)
                
        return list(output)

    def singleNumberBitWise(self,nums):
        missing = []
        bitmask = 0;
        for num in nums:
            bitmask = bitmask ^ num
        
        diff = bitmask & (-bitmask)
        first_missing = 0
        
        for num in nums:
            if (num & diff) != 0:
                first_missing = first_missing ^ num

        missing.append(first_missing)
        missing.append(first_missing ^ bitmask)

        return missing
        
        

nums = [1,2,1,3,2,5]
sol = Solution()

missing = sol.singleNumber(nums)
print(missing)

missing = sol.singleNumberBitWise(nums)
print(missing)
