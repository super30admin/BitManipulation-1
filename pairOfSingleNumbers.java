// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Traverse nums array and xor them, we will end up with xor1 of two single numbers
// We create a 2s complement of xor1
// compute bitwise & of the 2s complement with xor1
// Property: if we do an & with the single numbers, one of them will give 0 and other will give non-zero
// Itterate over the array for a second time and do an xor with numbers that give a non-zero value, the repeated numbers will cancel out each other
// finally you will get one of the single number, which can be used to get the other single number by doing an xor
class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int xor1=0;

        for (int num: nums) {
            xor1 ^= num;
        }

        // 2s complement of xor1 is -xor1
        int temp = xor1 & (-xor1);
        int xor2=0;

        // second pass, include the non 0 (num & temp) to xor2
        for (int num: nums) {
            if ((num & temp) != 0) {
                xor2 ^= num;
            }
        }
        return new int[]{xor2, xor1^xor2};
    }
}