// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
First, we do XOR operation for every number in the input array to get the XOR of both unique numbers. Now, we find
least significant bit by taking 2's complement and do 'and' operation to separate them. Next, we use the lsb
to calculate or identify one number and then use that number to compute another number by doing XOR again.
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitMask1 = 0;
        int bitMask2 = 0;

        for(int num : nums) {
            bitMask1 = bitMask1 ^ num;
        }

        int lsb = (bitMask1) & (-bitMask1);

        for(int num : nums) {
            if((lsb & num) != 0) {
                bitMask2 = bitMask2 ^ num;
            }
        }
        return new int[] {bitMask2, bitMask1 ^ bitMask2};
    }
}