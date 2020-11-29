//Time Complexity-O(n)
//Space Complexity-O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int num:nums)
        {
            x=x^num;
        }
        return x;
    }
}