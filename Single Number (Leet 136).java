// Time: O(n)
// Space: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
}
