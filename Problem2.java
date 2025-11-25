/*
136. Single Number
Ran on leetcode: Yes
TC: O(n) SC:O(1)
Loop through the array and XOR all the numbers, if we XOR same number the result is 0 so in the end the single number is remaining
*/
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int num: nums){
            result = result ^ num; // Since XOR of same numbers is 0, only the single number is left
        }

        return result;
    }
}