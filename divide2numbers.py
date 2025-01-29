class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        dividend1 = dividend
        dividend = abs(dividend)
        div = abs(divisor)
        count = 0
        nums = []
        while dividend >= div: 
            while div <= dividend:
                count += 1
                div = div << 1
            div = div >> 1
            count -= 1
            dividend = dividend - div
            div = abs(divisor)
            nums.append(count)
            count = 0
        sum1 = 0
        for i in nums:
            sum1 += 2 ** i

        if divisor * dividend1 < 0:
            return -1 * sum1
        return sum1
            


        
        