class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        '''
        Time complexity - O(N), N --> number of elements in the input list. Both the loops iterate through the list once.
        Space Complexity - O(1), to store the bitmasks and temporary variables.
        '''
        bitmask1 = 0  # Initialize the first bitmask

        # Calculate the XOR of all numbers to find the XOR of the two single numbers
        for num in nums:
            bitmask1 = bitmask1 ^ num

        # Find the least significant bit that is different between the two single numbers
        leastsigbit = bitmask1 & -bitmask1

        bitmask2 = 0  # Initialize the second bitmask

        # Separate the numbers into two categories based on the least significant bit
        for num in nums:
            if num & leastsigbit != 0:
                bitmask2 = bitmask2 ^ num

        # The first single number is bitmask2, and the second single number is bitmask1 XOR bitmask2
        return [bitmask2, bitmask1 ^ bitmask2]
