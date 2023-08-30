class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        '''
        Time complexity - O(log N), N --> value of the dividend. In each iteration of the while loop, the dividend gets halved (or close to halved) due to the left shifts. Therefore, the number of iterations required is proportional to the number of bits in the dividend.
        Space complexity - O(1) , for result and temporary variables.
        '''
        if divisor == 0:
            return math.inf  # Handle division by zero

        result = 0  # Initialize the result

        # Handle the case of negative dividend or divisor
        negative = (dividend < 0) ^ (divisor < 0)
        dividend = abs(dividend)
        divisor = abs(divisor)

        if dividend == 0:
            return 0

        if dividend < divisor:
            return 0

        if divisor == 1:
            if negative:
                return max(-dividend, -2147483648)
            else:
                return min(dividend, 2147483647)

        while dividend >= divisor:
            shifts = 0
            temp_divisor = divisor

            # Calculate the number of left shifts needed to bring the temp_divisor close to dividend
            while dividend >= (temp_divisor << 1):
                temp_divisor <<= 1
                shifts += 1

            # Update the result using bitwise left shift
            result += 1 << shifts

            # Update dividend for the next iteration
            dividend = dividend - temp_divisor

        # Apply the negative sign to the result if needed
        if negative:
            result = -result

        # Handle overflow case
        if result > 2**31 - 1:
            return 2**31 - 1
        elif result < -2**31:
            return -2**31
        return result
