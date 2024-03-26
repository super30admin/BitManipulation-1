/*Time Complexity: O(N)

Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes

Approach: Bit Manipulation - using bit masking (XOR operator)

Prob: 136. Single Number
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res = res ^ num;
        }
        return res;
    }
}