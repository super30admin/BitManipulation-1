#single number III
#Time Complexity: O(N)
#Space Complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        val = 0
        for i in nums:
            val ^= i
        val2 = val & (-val)
        temp = 0
        for i in nums:
            if i & val2!=0:
                temp ^= i
        
        return [temp,temp ^ val]