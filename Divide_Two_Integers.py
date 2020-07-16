// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach:
#In this problem we use the operation left shift instead of doing division or multiplication.look at the below example for better understanding.
#For the example if given dividend =31 and dividor=4.
#we start with 4.
#leftshift  boolean  value
#0           100     4
#1           1000    8
#2           10000   16
#3           100000  32 (32 greater than 31 so we stop there).
#remaining value == 31-16=15
#result=0+(2**(2))=4  (pow(2,numberofleftshifts)
#Now dividend=15 divisor=4
#leftshift  boolean  value
#0           100     4
#1           1000    8
#2           10000   16 (16 greater than 15 so we stop)
#remaining value=15-8=7 but still 7 is greater than 4.we stop only if it is less than 4.
#result=4+(2**1)=6
#Now dividend =7 divisor=4.
#leftshift  boolean  value
#0           100     4
#1           1000    8(8 is greater than 7 we stop here).
#remaining value=7-4=3 (3 is less than 4 so we stop)
#result=6+1=7

# Time complexity --> o(log(dividend))
# space complexity --> o(1)
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if dividend== -2147483648 and divisor==-1:
            return 2147483647
        divid=dividend
        divis=divisor
        #we are checking if the given dividend or divisor is positive or negative.If negative we store the - sign to add it to the result at the end
        if dividend<0:
            dividend=-1*dividend
        if divisor<0:
            divisor=-1*divisor
        result=0
        
        while dividend>=divisor:
            numofleftshifts=0
            #In this problem we do left shifts to double the value of the divisor.we double the divisor and check at which shift does the divisor value goes more than the dividend
            while dividend>=(divisor<<numofleftshifts):
                numofleftshifts=numofleftshifts+1
            numofleftshifts=numofleftshifts-1
            #we store the value of pow(2,number of shifts) in the result.
            result=result+(1<<(numofleftshifts))
            # print(result)
            dividend=dividend-(divisor<<numofleftshifts)
        if (divid>0 and divis>0) or (divid<0 and divis<0):
            return result
        print(sys.maxint)
        return -result
            