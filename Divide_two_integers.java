TC:O(n)
SC:O(1)

Leetcode : Failed

Approach : Till I reach the dividend my adding divisor one after another I will increase the count. Failed due to overflow.


class Solution {
    public int divide(int dividend, int divisor) {
        int count = 0;
        if(divisor <0 && dividend <0 ||  divisor >0 && dividend > 0 ){
           while(Math.abs(dividend)>= Math.abs(divisor)){
            dividend = Math.abs(dividend)-Math.abs(divisor);
            count++;
        }
        return count; 
        }
        else{
            while(Math.abs(dividend)>=Math.abs(divisor)){
            dividend = Math.abs(dividend)-Math.abs(divisor);
            count++;
        }
        return -count;
        } 
        
        
        
    }
}
