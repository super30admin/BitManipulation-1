# Using hash sets
# STEPS:
# traverse the nums array
# add the num to the result set if it is not already present.
# remove the num from the set if it is present.
# this will help keep track of number appearing odd number of times. (since the number ony appears once or twice, this will work).
# Time complexity - O(n)
# Space complexity - O(n)
class Solution:
    def singleNumber(self, nums: int) -> List[int]:
        result = set()
        for num in nums:
            if num in result:
                result.remove(num)
            else:
                result.add(num)
        return result


# By bit-manipulation
# Time complexity - O(n)
# Space complexity - O(1)
class Solution:
    def singleNumber(self, nums: int) -> List[int]:
        bitmask = 0
        """
        Create a bitmask (using XOR)
        This will give XOR of the numbers which appears only once
        because num (XOR) num = 0
        """
        for num in nums:
            bitmask ^= num
        
        """
        Find the rightmost significant bit from the mask
        Since this bit will be unique to one number. 
        We can use this to separate out one number from the other in the next step.
        """
        comp = ~bitmask + 1 
        rightmost = bitmask & comp        
        # rightmost = bitmask & (-bitmask)

        """
        Separate one number.
        Since the rightmost bit will be unique to just one number - obtain one number out of the two non-repeating numbers.
        """
        num1 = 0
        for num in nums:
            # all the repeating numbers will not be counted in the result since num(XOR)num = 0
            if num & rightmost: # non-zero
                num1 ^= num
    
        return [num1, bitmask ^ num1]
