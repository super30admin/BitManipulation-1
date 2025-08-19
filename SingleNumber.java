// SC - O(1)
// TC - O(n)

class Solution {
    public int singleNumber(int[] nums) {
        int xor =0;
        for(int n : nums)
            xor ^= n;
        return xor;
    }
}
