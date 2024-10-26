# Time complexity: O(n)
# Space complexity: O(1)

def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1  # Return max int for overflow case
        # use absolute for division process
        d = abs(dividend)
        m = abs(divisor)
        res = 0
        # while dividend is greater than divisor bit shift to left 
        # then if  remainder is greater than divisor then dividend ==  divisor
        while d >= m:
            shifts = 1
            while d >= m << shifts:
                shifts +=1

            shifts-=1

            res += 1 << shifts

            d = d-(m << shifts)
        #  if either dividend or divisor is negative then result will be a negative number
        if (dividend < 0 and divisor > 0) or (dividend > 0 and divisor < 0):
            return -res
        return res