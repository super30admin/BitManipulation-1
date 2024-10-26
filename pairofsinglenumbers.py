def singleNumber(self, nums: List[int]) -> List[int]:
    bitmask1 = 0
    # XOR
    for i in range(len(nums)):
        bitmask1 = bitmask1^nums[i]
    # bitmask1 is combination of 2 numbers
    #2's compliment and get least significent bit

    lsb = bitmask1 & (-bitmask1)
    bitmask2 = 0
    # XOR again
    for i in range(len(nums)):
        
        if (nums[i] & lsb) != 0:
            bitmask2 = bitmask2^nums[i]
    # return the number found i.e bitmask2 and and XOR between bitmask1 and bitmask2
    return[bitmask2, bitmask1^bitmask2]
