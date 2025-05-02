// https://leetcode.com/problems/divide-two-integers/description/
// Time Complexity: O(log n) 
// Space Complexity: O(1)

class Solution {
    public:
        int divide(int dividend, int divisor) {
            int flag = 0;
            unsigned int res=0;
            if(dividend == INT_MIN && divisor == -1) return INT_MAX;
            if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) flag = 1;
            long long ldividend = abs((long long) dividend);
            long long ldivisor = abs((long long) divisor);
            while(ldividend >= ldivisor){
                int shifts = 0;
                while(ldividend >= (ldivisor << shifts)) shifts++;
                shifts--;
                res += 1 << shifts;
                ldividend -=  ldivisor << shifts;
            }
            return (flag == 1) ? res : -res;
        }
    };