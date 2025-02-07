// Approach : Instead of using extra space of HashSet. We can use XOR operation to find the single unique number from the array 
// Time : o(n)
// Space : o(1)
class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num:nums){
            bitmask = bitmask ^ num;
        }
        return bitmask; // This could be Unique number
    }
}