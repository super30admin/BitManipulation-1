#Time complexity: O(n)
#Space complexity: O(1)
# Works on leetcode: yes 
# Approach: We use two pass here, in first pass we xor all the numbers. Now since we know the 2 numbers are different, they
#will have atleast one bit different in both, one number will have it 0 and the other will be 1 and we find that bit (call it
#mask). In next traversal, we divide the numbers in two groups of depending on the bit (1 or 0)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        a,b, xor = 0,0,0
        for n in nums:
            xor ^= n
        mask = 1
        while(xor&mask==0):
            mask <<= 1
        for n in nums:
            if n&mask:
                a ^= n
            else:
                b ^= n
        return [a,b]