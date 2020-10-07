#Time complexity: O()
#Space complexity: O()
# Works on leetcode: yes 
# Approach: First we take absolute values of the dividend and divisor and save the sign which will result  from division.
#Then its just  the quotient of a division is just the number of times that we can subtract the divisor from the 
#dividend without making it negative. But we start from the divisor and double it every time after subtraction until we have 
# a reminder. And finally we process the reminder similarly 
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = 1 if (dividend > 0)==(divisor > 0) else -1
        p,q = abs(dividend), abs(divisor)
        res = 0
        while p>=q:
            temp, i = q,1
            while p>=temp:
                p -=temp
                res +=i
                i *=2
                temp *=2
        res *=sign
        #print(res)
        return min(max(-2**31,res),2**31 - 1)