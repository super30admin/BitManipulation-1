class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        #Method 1 - hashmap - O(n) TC and SC

        #Method 2 - Bitwise operations. - O(n) TC and O(1) SC
        #So, we know XOR the whole array gives sum of elements that occur only once. so we have a+b=5.
        #Then, to find one of the elements find the least significant bit. This is the bit differs in the 2 elements. Tp find least significant bit AND with 2's complement of the XOR.
        #Then, AND with all array elements and whichever gives 1 -> do XOR of them all -> you will find a or b.
        #Then, do XOR of this element with the initial XOR sum. Essentially, you know a or b use it in a+b=5 equation.
        res1=0
        for num in nums: #Finding XOR of all elements
            res1^=num #res1 is a+b=5
        least_sig_bit=(res1)&(-res1) #Finding Least Significant Bit
        res2=0
        for num in nums:
            if (least_sig_bit)&(num)!=0: #Get elements which give 1 when you AND with Least Significant Bit
                res2^=num #Do XOR for such elements -> a or b is now found in res 2
        return [res2,res2^res1] #do XOR and find the other -> plug a or b into a+b=5
        
