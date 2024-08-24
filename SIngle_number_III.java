// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i =0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        int temp = xor & (-xor);
        int xor2=0;

        for(int i =0; i<nums.length; i++){
            if((temp & nums[i]) != 0){
                xor2 = xor2 ^ nums[i];
            }
        }
        return new int[]{xor2 , xor ^ xor2};
    }
}