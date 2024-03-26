/*Time Complexity: O(N)

Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes

Approach: Bit Manipulation - using bit masking (XOR operator)

Prob: 136. Single Number III
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num : nums){
            bitmask ^= num;
        }
        int lsb = bitmask & (-bitmask);
        int bitmask2 = 0;
        for(int num : nums){
            if((lsb & num) != 0){
                bitmask2 ^= num;
            }
        }
        return new int []{bitmask2,bitmask^bitmask2};
    }
}