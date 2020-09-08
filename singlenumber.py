# Using Hash Sets.
# Traverse the nums array
# Add the number to the hash set, if it doesn't already exists.
# Remove the number from hash set if it's present in the hash set.
# Pop the element left in the hash set.
# Time complexity - O(n)
# Space complexity - O(n)
# Did this solution run on leetcode? - yes
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = set()
        for num in nums:
            if num in result:
                result.remove(num)
            else:
                result.add(num)
        return result.pop()


# By taking XOR of numbers.
# num (XOR) num = 0
# Only one element will remain at the end.
# Time complexity - O(n)
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            result ^= num
        return result


# By finding all the unique elements and adding them to the set.
# Multiply the sum of elements by 2 and subtract the sum of nums to find the element which occurs once.
# Time complexity - O(n)
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return 2*sum(set(nums)) - sum(nums)
            