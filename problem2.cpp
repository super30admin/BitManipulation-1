/*
// Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int divide(int dividend, int divisor) {
        if(dividend == INT_MIN && divisor == -1) return INT_MAX;
        int sgn = (dividend>0)^(divisor>0)?-1:1;
        long dvd = labs(dividend),dvs = abs(divisor),ans = 0;
        while(dvd>=dvs){
            long temp{dvs},m=1;
            while(temp<<1 <=dvd){
                temp<<=1;
                m<<=1;
            }
            dvd-=temp;
            ans+=m;
        }
        return ans*sgn;
    }
};