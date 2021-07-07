'''
136. Single Number
Time complexity - O(N)
space complexity - O(N)

# approach - if two elements are equal then it returns 0 for XOR in bit manipulation 
'''


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        map={}
        for i in nums:
            if i not in map:
                map[i]=1
            else:
                map[i]+=1
    
        for key,val in map.items():
            if val==1:
                return key

            
# bit manipulation
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a=0
        for i in nums:
            print(a)
            a=a^i
            print(a,i)
        return a
    
#  hash set