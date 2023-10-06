class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        #Method 1 - Repeated subtraction - O(n) TC

        #Bitwise shifting -> O(log n) TC
        if divisor == 0: #edge case 
            return 2147483647 
        if dividend == -2147483648 and divisor == -1: #edge case
            return 2147483647
    
        res=0
        new_dividend=abs(dividend) #take abs, less headache
        new_divisor=abs(divisor)
        while new_dividend>=new_divisor: 
            shifts=0
            while new_divisor << shifts <=new_dividend: #first set of shifts
                shifts+=1
            shifts-=1 #we will go over board and then come back, so -1
            res+=1 << shifts #this is doing 2 to the power x calculation
            new_dividend-=new_divisor << shifts #now, if there is something left to divide, it will happen in the next loop of the main while loop.
        if (dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0): #this to handle the signs
            return res
        else:
            return -res

        #Say you divide 25/4, we know the answer is 6.
        #4<<1 is 8
        #8<<1 is 16
        #16<<1 is 32. We went over 25 so stop. 
        #How many shifts now? 3-1=2.
        #25-16=9. So, do 9/4
        #4<<1 is 8
        #8<<1 is 16. We went over 9 so stop. 
        #How many shifts now? 2-1=1. 
        #2**2+2*1=6.
