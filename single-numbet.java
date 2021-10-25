//TC: O(n)
//SC: O(1)
//running on leetcode: yes
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }
}
