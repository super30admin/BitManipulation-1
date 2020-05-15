'''
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: XOR of 2 duplicate numbers negates the duplication, perform xor until the end at the unique number will be
present in the xor variable as its unique
'''
def singleNumber(self, nums: List[int]) -> int:
    # bitmanipulation

    xor = 0
    for i in range(0, len(nums)):
        xor = xor ^ nums[i]

    return xor