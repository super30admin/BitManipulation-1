// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class SingleNumber {
    class Solution {
        public int[] singleNumber(int[] nums) {
            int bitmask = 0;

            for(int i=0; i<nums.length; i++) {
                bitmask ^= nums[i]; // 1st eq x1 + y1 = c1
            }

            int temp = bitmask & - bitmask; // bitmask & (2's compliment(bitmask))

            int bitmask2 = 0;
            for(int i=0; i<nums.length; i++) {
                if((nums[i] & temp) != 0) {
                    bitmask2 ^= nums[i]; // 2nd eq x1 - y1 = c2
                }

            }
            return new int[] {bitmask2, bitmask2 ^ bitmask};
        }
    }
}
