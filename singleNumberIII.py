"""
TC- O(2n) ie O(N)
SC O(1)

1. create a bitmask (using XOR). 
2. will get XOR of the numbers which appears only once.
3. Take 2s complement of bitmask and do Bitmask AND 2scompl. you will get diff
4. eACH Num AND diff , you will get 0 and finite value
Then, we can find the rightmost significant bit from the mask since this bit will be unique to one number. We can use this to 
separate out one number from the other.


"""

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask ^= num
            
        diff = bitmask & (-bitmask) #-bitmask is 2s compliment ie invert the number in Binary and add 1.
        print(diff)
        bitmask2 = 0
        for num in nums:
            if (diff & num): #diff and num !=0
                bitmask2 ^= num

        return [int(bitmask2), int(bitmask2 ^ bitmask)]
        