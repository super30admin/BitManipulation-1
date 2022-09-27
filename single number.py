# Time complexity: O(n)
# Space complexity: O(1)
# Approach: Use bit manipulation
# use xor- xor of same numbers will be 0 soo all the repeating numbers will cancel out with each other and single count number will remain in the end



class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        answer = 0
        for num in nums:
            answer = answer ^ num
        return answer
        
        
        