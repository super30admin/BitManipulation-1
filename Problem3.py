# Problem 3: Single Number III
# Time Complexity: O(n), two passes through nums, each O(n)
# Space Complexity: O(1), only a few integer variables, no extra data structures
# Approach:
# Two numbers appear once, all others appear twice. XOR cancels out pairs (x ^ x = 0), so XORing everything together leaves us with (a ^ b), the XOR of the two unique numbers. 
#To split a and b apart, we find one bit position where they differ (using the lowest set bit of a ^ b), then use that bit to divide all numbers into two groups. 
#Duplicate pairs always land in the same group (so they still cancel out), but a and b land in different groups. 
#XORing one group isolates one answer; XORing it with (a ^ b) gives the other.

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask1 = 0
        for i in nums:
            bitmask1 = bitmask1 ^ i
        # bitmask1 is now (a ^ b), since all duplicate pairs cancelled out

        bitmask2 = 0
        Least_Significant_Bit = bitmask1 & -bitmask1
        # isolates the lowest bit where a and b differ
        # this bit will be used to separate a and b into different groups

        for i in nums:
            if (i & Least_Significant_Bit) != 0:
                bitmask2 = bitmask2 ^ i
        # only XOR numbers that have this differing bit set
        # duplicate pairs still cancel (both copies go to the same group)
        # only one of {a, b} has this bit set, so bitmask2 ends up as that one number

        return [bitmask2, bitmask1 ^ bitmask2]
        # bitmask2 is one answer (say a)
        # bitmask1 ^ bitmask2 = (a ^ b) ^ a = b, the other answer