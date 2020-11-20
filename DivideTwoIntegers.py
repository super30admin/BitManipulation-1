//TC: O(1)
//SC: O(1)
public class DivideTwoIntegers:
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        a = int(dividend/divisor)
        b = int(dividend%divisor)
        if a <= -1 and a > -2147483647 and b != 0:
            return a+1
        elif a >= 2147483647:
            return 2147483647
        elif a <= -2147483648:
            return -2147483648
        else:
            return a
