//TC: O(n), two passes are done of the given array
//SC: O(1)
//running on leetcode: yes
class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length==0) return new int[] {};
        int xor = 0;
        for(int num : nums) {
            xor = xor ^ num;
        }
        int compliment = xor &(-xor);
        int xor1 = 0;
        for(int num : nums) {
            if((compliment & num) != 0) {
                xor1 = xor1 ^ num;
            }
        }
        return new int[] {xor1, xor ^ xor1};
    }
}
