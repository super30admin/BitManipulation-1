# Time: O(logn)
# Space: O(n)
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        flag = False
        if dividend <0 and divisor < 0:
            divisor *= -1
            dividend *= -1
        elif dividend < 0:
            dividend *= -1
            flag = True
        elif divisor < 0:
            divisor *= -1
            flag = True
        ans = 0
        temp2 = dividend
        while dividend > divisor:
            i = 0
            temp = divisor
            while temp < dividend:
                temp = temp << 1
                if temp > dividend:
                    break
                i += 1
            if temp > dividend:
                dividend -= temp >> 1  
            else:
                dividend -= temp
            ans += pow(2, i)
            #print(i, ans, dividend)
            if dividend == divisor:
                ans += 1
                break
        if temp2 == divisor:
            ans = 1
        if flag:
            if -ans < -pow(2, 31):
                return -pow(2, 31)
            return -ans
        if ans > (pow(2, 31)-1):
            return pow(2, 31)-1
        return ans
        
