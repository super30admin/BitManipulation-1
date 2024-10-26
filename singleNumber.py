# time complexity: O(n)
# space complexity: O(1)

def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for i in range(len(nums)):
            # XOR as same cancels each other out.
            res = res^nums[i]

        return res      