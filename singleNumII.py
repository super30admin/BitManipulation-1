'''
Time Complexity : O(n) 
Space Complexity : O(1)
'''
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        mask = 0
        
        for num in nums:
            mask ^= num
            
        diff = mask & (-mask)
        
        mask2 = 0
        for num in nums:
            if diff & num:
                mask2 ^= num
                
        return [int(mask2) ,int(mask ^ mask2)]