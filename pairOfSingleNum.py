"""
XOR all numbers - result is xor_all = a ^ b where a and b are the two unique numbers
Find any set bit in xor_all (e.g., rightmost set bit) — this bit differs between a and b
Partition numbers into two groups based on this bit and XOR separately to get a and b
"""
"""
Time Complexity: O(n) -  single pass for XOR, single pass for grouping
Space Complexity:  O(1) no extra structures
"""

class pairOfSingleNum:
    def singleNumber(self, nums: list[int]) -> list[int]:
        xor_all = 0
        for num in nums:
            xor_all ^= num
   
        diff_bit = xor_all & -xor_all
        
        a = b = 0
        for num in nums:
            if num & diff_bit:
                a ^= num
            else:
                b ^= num
        
        return [a, b]

if __name__ == "__main__":
    obj = pairOfSingleNum()
    print(obj.singleNumber([1, 2, 1, 3, 3, 4, 4, 8, 2, 5]))  # [8, 5]
    print(obj.singleNumber([4, 1, 2, 1, 2]))                 # [4, 0] — here second unique is 0
