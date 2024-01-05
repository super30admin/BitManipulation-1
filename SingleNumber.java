// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
        /*Bit Manipulation
        using XOR op
        do ^ op on all nums,  */

            int result = 0;

            for(int num : nums){
                result = result ^ num;
            }

            return result;
        }
    }
}
