# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask=0
        for i in nums:
            bitmask^=i#101,011=>110
        bitmask2= ~bitmask + 1 #010
        
        temp=bitmask & bitmask2
        print(temp)
        result=0
        for i in nums:
            if temp & i:
                result^=i
        

        return [result, result ^ bitmask]
        