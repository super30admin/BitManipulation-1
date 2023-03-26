class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        k=set(nums)
        k1=sum(k)
        k2=sum(nums)
        return 2*k1-k2
            
                
                