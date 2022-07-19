/*
Problem: https://leetcode.com/problems/single-number/
*/
class Solution {
    public int singleNumber(int[] nums) {
        int xorResult = 0;
        for (int num : nums) {
            xorResult = xorResult ^ num;
        }
        return xorResult;
    }
}