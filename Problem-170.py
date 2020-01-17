'''
leetcode - 260. Single Number III
time complexity - o(n)
space complexity - o(1)

'''
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor=0
        for num in nums:
            xor=xor^num
        
        diff=xor & (-xor)
        
        x=0
        for num in nums:
            if diff&num!=0:
                x=x^num
        return [x,xor^x]
                
            
        