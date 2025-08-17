// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : First compute xor of all numbers in array. This xor is x^y where x and y are the two unique numbers.
/// To find the differing bit of x and y, compute the bit differing both as xor & -xor, now split the arrow absed on that bit.
/// Let's choose all those numebrs in nums array that have that speciifc bit 1, say this is xor2. This xor is one of the unique number
/// Find the other unique number as xor ^ xor2
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        System.out.println(xor);
        int bitmask = xor & (-xor);
        System.out.println(bitmask);
        int xor2 = 0;
        for(int i=0;i<nums.length;i++){
            if((bitmask & nums[i])!=0)
            {
                xor2 = xor2 ^nums[i];
            }
        }
        res[0] = xor2;
        res[1] = xor ^ xor2;
        return res;
    }
}