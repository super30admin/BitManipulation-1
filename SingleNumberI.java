// Time: O(N) | Space: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num: nums) {
            res ^= num;
        }
        return res;
    }
}