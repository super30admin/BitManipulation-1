# 260. Single Number III
# https://leetcode.com/problems/single-number-iii/

# Logic: We iterate over the input and take xor of all the numbers, 
# lets call it bitmask. After the iteration, bitmask will contain 
# xor of the two numbers that are present only once. Now we make a 
# temp which is and of bitmask and 2s compliment of bitmask. This 
# temp has a property that if you and it with the input one of the 
# number that is non repeating will give output as 0. But it is 
# also possible that other numbers also make it zero. So we make a 
# bitmask 2 which will have xor of all the numbers that give 0 when 
# you and them with temp. Xor will remove all the numbers that make 
# the and zero so after the iteration, bitmask2 will be one of the 
# number that is not repeating. We return bitmask2 and xor of bitmask1 
# and bitmask1.

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        
        for i in nums:
            bitmask ^= i
        
        temp = bitmask & (-bitmask)
        
        bitmask2 = 0
        for i in nums:
            if temp & i == 0:
                bitmask2 ^= i
        
        return [bitmask2, bitmask ^ bitmask2]