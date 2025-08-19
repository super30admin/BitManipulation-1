"""
We can’t use *, /, %, so repeatedly subtracting divisor would be too slow
Instead, use bit shifts to subtract the largest possible multiple of the divisor at each step
Keep doubling (<< 1) the divisor until it’s just below the remaining dividend, subtract, and accumulate the quotient
"""
"""
Time Complexity: O(log^2(dividend)) — Inner loop shifts divisor, outer loop repeats for remaining dividend.
Space Complexity: O(1) — No extra data structures.
"""

class divideIntegers:
    def divide(self, dividend: int, divisor: int) -> int:

        INT_MAX, INT_MIN = 2**31 - 1, -2**31

        if dividend == INT_MIN and divisor == -1:
            return INT_MAX
        
        negative = (dividend < 0) ^ (divisor < 0)


        dvd, dvs = abs(dividend), abs(divisor)
        quotient = 0

        while dvd >= dvs:
            temp, multiple = dvs, 1
            while dvd >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            dvd -= temp
            quotient += multiple

        return -quotient if negative else quotient

if __name__ == "__main__":
    obj = divideIntegers()
    print(obj.divide(10, 3))     # 3
    print(obj.divide(7, -3))     # -2
    print(obj.divide(-2147483648, -1))  # 2147483647 (overflow case)
    print(obj.divide(1, 1))      # 1
