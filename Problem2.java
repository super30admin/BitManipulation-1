package BitManipulation-1;
// TC: O(n)
// SC: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result = result ^ num;
        }
        return result;
    }
}
