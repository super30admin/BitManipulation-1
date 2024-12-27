#Time Complexity: The nested loops result in a time complexity of O(log(dividend)×log(dividend))=O(log^2(dividend))
#Space Complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
        pdividend = abs(dividend)
        pdivisor = abs(divisor)
        result = 0
        while(pdividend>=pdivisor):
            numShifts = 1
            while((pdivisor<<numShifts)<=pdividend):
                numShifts+=1
            numShifts-=1
            result += 1<<numShifts
            pdividend = pdividend - (pdivisor<<numShifts)
        if(dividend>0 and divisor>0):
            return result
        elif(dividend<0 and divisor<0):
            return result
        else:
            return -result


        