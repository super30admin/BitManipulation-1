class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #Method 1 - Hashset - use hashset to keep track of what all has been seen, the moment you see it again, remove from ahshset, then in the end just return the hashset.
        #TC and SC O(n)

        #Method 2 - Bitwise XOR -> XOR the entire array, the indiviual element will pop up in the end.
        #TC O(n) and SC O(1)
        res=0
        for num in nums:
            res^=num
        return res