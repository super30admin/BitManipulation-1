// Time Complexity : O(log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// edgeCase: if INT_MIN divide by -1 , we get a positive number greater than INT_MAX.

class Solution {
public:
    int divide(int dividend, int divisor) {
        if(dividend == INT_MIN && divisor==-1) return INT_MAX;
        
        long long ldividend = dividend ;
        long long ldivisor = divisor;
        long long ans = 0;
        bool negative = false;
        
        if(ldivisor<0){
            negative = !negative;
            ldivisor = -ldivisor;
        }
        if(ldividend<0){
            negative = !negative;
            ldividend = -ldividend;
        }
        
        while(ldividend>=ldivisor){
            int shifts = 0;
            while((ldivisor<< shifts) <=ldividend){
                shifts++;
            }
            shifts--;
            ans+= (1<<shifts);
            ldividend-= (ldivisor<<shifts);
        }
        
        return (negative==true)?(int)-ans:(int)ans;
    }
};