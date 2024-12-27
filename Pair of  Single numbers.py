#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor = 0
        for n in nums:
            xor ^= n
        diff_bit = 1
        while(xor & diff_bit)==0:
            diff_bit = diff_bit << 1
        a,b=0,0
        for n in nums:
            if(diff_bit & n)!=0:
                a ^= n
            else:
                b ^= n
        return [a,b]

        #Brute Force
        # hashmap=defaultdict()
        # result = list()
        # for num in nums:
        #     if(num in hashmap):
        #         hashmap[num]+=1
        #     else:
        #         hashmap[num]=1
        # for num in hashmap:
        #     if(hashmap[num]==1):
        #         result.append(num)
        # return result  
        