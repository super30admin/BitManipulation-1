/* 
    Time Complexity                              :  O(log N)
    Space Complexity                             :  O(1)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std;  

class Solution {

int divide(int divisor, int dividend) {

    if(divisor == 0) return INT_MAX;
    if(divisor == -1 and dividend == INT_MIN) return INT_MAX;

    long ldivisor = labs(divisor);
    long ldividend = labs(dividend);
    bool sign = (divisor > 0) ^ (dividend > 0);
    int ans = 0;
    while(divisor <= dividend) {
        int shift = 0;
        while(dividend >= (divisor << shift)) {
            shift++;
        }
        shift--;
        ans += (1 << shift);
        dividend -= (divisor << shift);  
    }

    return sign == true ? -ans : ans;
}

};