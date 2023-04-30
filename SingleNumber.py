"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def singleNumber(nums) -> int:
    result = 0
    for num in nums:
        result ^= num
    return result


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all the test cases.
    """
    print(singleNumber(nums=[2, 2, 1]))  # returns 1
    print(singleNumber(nums=[4, 1, 2, 1, 2]))  # returns 4
    print(singleNumber(nums=[1]))  # returns 1


if __name__ == "__main__":
    main()
