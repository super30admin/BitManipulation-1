// Time Complexity : O(n)  where n is the number of elements of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understanding Bitmask concept
/* Your code here along with comments explaining your approach: If you get XOR of all numbers, we will get a bitmask contributed by both the numbers.
Take the 2's complement and do & with bitmask and store the diff. For each number do & with the diff, XOR will wash away duplicates and if its not
equal to 0, one number will remain non zero. So x will get the non zero number and x ^ bitmask will give the other number. 
*/
class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int bitmask = 0;
        for(int i = 0; i < nums.length; i++)
            bitmask = bitmask ^ nums[i];                                                                    // XOR of all numbers
        int diff = bitmask & (-bitmask);                                                        // Two's complement
        int x  = 0;
        for(int num:  nums){
            if((num & diff) != 0){                                                          // One number  will give non zero out of two
                x ^= num;                                                                       // Store that number at x
            }
        }
        return new int[]{x, x ^ bitmask};                                                       // Return both the numbers
    }
}