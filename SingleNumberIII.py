"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def singleNumber(nums):
    bitmask = 0
    for num in nums:
        bitmask ^= num

    temp = bitmask & (-bitmask)
    bitmask2 = 0

    for num in nums:
        if temp & num != 0:
            bitmask2 ^= num

    return [bitmask2, bitmask ^ bitmask2]


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all the test cases.
    """
    print(singleNumber(nums=[1, 2, 1, 3, 2, 5]))  # return [3, 5]
    print(singleNumber(nums=[-1, 0]))  # return [-1, 0]
    print(singleNumber(nums=[0, 1]))  # return [1, 0]


if __name__ == "__main__":
    main()
