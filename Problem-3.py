class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xorVal=0
        for num in nums:
            xorVal=xorVal ^ num
            
        rmBit=xorVal & (-xorVal)
        
        x=0
        for num in nums:
            if num & rmBit !=0:
                x=x^num
                
        return [x,x^xorVal]