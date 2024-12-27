#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0
        for n in nums:
            xor ^= n
        return xor

        #Brute Force
        # hashmap=defaultdict()
        # result = 0
        # for num in nums:
        #     if(num in hashmap):
        #         hashmap[num]+=1
        #     else:
        #         hashmap[num]=1
        # for num in hashmap:
        #     if(hashmap[num]==1):
        #         result=num
        # return result           
        