// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num: nums){
            bitmask = bitmask ^ num;
        }
        return bitmask;
    }
}