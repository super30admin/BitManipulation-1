// Time Complexity : O(log n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. Left shift by divisor when the value crosses save the result
//2. Repeat the left shift process for the remainder if the remainder is greater than divisor
//3. Add the two values and return.

class Solution {
public:
    int divide(int dividend, int divisor) {
        //edge
        if(dividend ==0 || divisor==0)
            return 0;
        if(dividend ==INT_MIN && divisor == -1)
            return INT_MAX;
        if(dividend ==INT_MIN && divisor == 1)
            return INT_MIN;
        
        long l_dividend = (long) abs(dividend); 
        long l_divisor = (long) abs(divisor);
        int result =0;
        int num_shifts=0;
        int quotient = l_divisor;
        while(l_dividend >= l_divisor){
            num_shifts=0;
            while(l_dividend >= (l_divisor<<num_shifts)){
                num_shifts++;
            }
            num_shifts--;
            result = result + (1<<num_shifts);
            l_dividend = l_dividend - (l_divisor<<num_shifts);
        }
        if(dividend>0 && divisor<0) return -result;
        if(dividend<0 && divisor>0) return -result;
        return result;
    }
};
