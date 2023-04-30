"""
Rasika Sasturkar
Time Complexity: O(logk), where k is some integer less than n.
Space Complexity: O(1)
"""

from math import inf


def divide(dividend: int, divisor: int) -> int:
    # edge case
    if divisor == 0:
        return inf
    if dividend == -2147483648 and divisor == -1:
        return 2147483647

    dividend1 = abs(dividend)
    divisor1 = abs(divisor)
    result = 0
    while dividend1 >= divisor1:
        shifts = 0
        while dividend1 >= (divisor1 << shifts):
            shifts += 1
        shifts -= 1
        result += 1 << shifts  # 2^shifts
        dividend1 = dividend1 - (divisor1 << shifts)

    if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
        return result
    return -result


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all the test cases.
    """
    print(divide(dividend=10, divisor=3))  # returns 3
    print(divide(dividend=7, divisor=-3))  # returns -2


if __name__ == "__main__":
    main()
