class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask ^= num
        twocompbitmask = ~bitmask + 1
        temp = bitmask & twocompbitmask
        bitmask2 = 0
        for num in nums:
            res = temp & num
            ##if result not equal to 0 we are xoring in the second bitmask, from this we will get one of the numbers
            if res != 0:
                bitmask2 ^= num
            ##othernumber we can get just xorin bitmas2 and initial bitmask

        return [bitmask2, bitmask2 ^ bitmask]
    #             missnumber1=num
    #             missnumber2=bitmask2^num
    #             return [missnumber1, missnumber2]
    # """
    # Calculate bitmask so as to the binary representation of the
    # two mising numbers, then find the two's complement of the bitmask,
    # and we do and operation between bitmask and two's complement
    # bitmask. We can call this result as temp. Now the property of temp
    # is that with its and operation it would be give 0 with one of the         missing numbers and with other missing number it is never going to
    # give us 0.
    # """
