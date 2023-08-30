class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        '''
        Time complexity - O(N), N --> number of elements in the input list. Since we iterate through the list once, the XOR operation for each number takes constant time.
        Space Complexity - O(1) to store the result.
        '''
        result = 0  # Initialize the result variable to store the XOR of all numbers

        # Iterate through the list of numbers
        for num in nums:
            result = result ^ num  # Perform bitwise XOR operation

        return result  # Return the final result
