//https://leetcode.com/problems/single-number
//TC : O(n)
//SC : O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i : nums){
            result = result ^ i;
        }
        return result;
    }
}
