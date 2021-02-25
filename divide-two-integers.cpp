//Time - O(1)
//Space - O(1)
class Solution {
public:
    int divide(int dividend, int divisor) {
        if(!divisor || dividend == INT_MIN && divisor == -1){
            return INT_MAX;
        }
        long ans = 0;
        
        int sign = (dividend<0 ^ divisor<0)?-1:1;
        long dvd = labs(dividend);
        long divi = labs(divisor);
        
        while(dvd>=divi){
            long tempDiv = divi, numMuls = 1;
            while(dvd>=tempDiv<<1){
               tempDiv = tempDiv<<1;
               numMuls = numMuls<<1;
            }
            ans = ans + numMuls;
            dvd = dvd - tempDiv;
        }

        return sign*ans;
        
        
    }
};