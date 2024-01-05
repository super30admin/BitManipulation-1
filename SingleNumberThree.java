// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class SingleNumberThree {
    class Solution {
        public int[] singleNumber(int[] nums) {
        /*Bit Manipulation
        XOR through all nums: XOR of those 2 nums will be there
        find Most Significant Bit(msb) among them
        msb = xor & 2's(-xor)'
        loop through nums and fins that matches lsb = lsb & nums
        XOR to find other num*/

            int xor = 0;

            for(int num : nums){
                xor = xor ^ num;
            }

            int lsb = xor & (-xor);
            int ele1 = 0;

            for(int num : nums){
                if((lsb & num) != 0){
                    ele1 = ele1 ^ num;
                }
            }

            int ele2 = ele1 ^ xor;

            return new int[]{ele1, ele2};
        }
    }
}
