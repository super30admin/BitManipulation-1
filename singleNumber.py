"""
The key property of XOR (^) is: a ^ a = 0 (same numbers cancel out) a ^ 0 = a (XOR with zero does nothing)
Since every number except one appears twice, XORing all numbers leaves only the single number
This runs in O(n) time and O(1) space without extra data structures
"""
"""
Time Complexity: O(n) Single pass through the list
Space Complexity: O(1) Constant extra space
"""

class singleNumber:
    def singleNumberTest(self, nums: list[int]) -> int:
        result = 0
        for num in nums:
            result ^= num
        return result
    
if __name__ == "__main__":
    obj = singleNumber()
    print(obj.singleNumberTest([2, 2, 1]))        # 1
    print(obj.singleNumberTest([4, 1, 2, 1, 2]))  # 4
    print(obj.singleNumberTest([1]))              # 1
