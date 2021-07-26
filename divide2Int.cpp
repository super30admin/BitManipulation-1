//Time& Space - O(logn) where n is the value of dividend
class Solution {
public:
    int divide(int dividend, int divisor) {
        if(dividend != 0 && divisor == 0) return INT_MAX;
        if(dividend == INT_MIN && divisor == -1) return INT_MAX;
        long ldividend = abs((long)dividend);
        long ldivisor = abs((long)divisor);
        unsigned int result = 0;
        while(ldividend >= ldivisor){
            int numShifts = 0;
            while(ldividend >= (ldivisor << numShifts)){
                numShifts++;
            }
            numShifts--;
            ldividend = ldividend - (ldivisor << numShifts);
            result += 1 << numShifts;
        }
        if(dividend < 0 && divisor < 0) return result;
        if(dividend > 0 && divisor > 0) return result;
        return -result;
    }
};