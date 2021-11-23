class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0; // gives us combination of two missing nums
        for(int num: nums){
            bitmask ^= num;
        }
        
        int temp = bitmask & (-bitmask);
        int bitmask2 = 0;
        // temp gives 0 result with one of the missing nums & non-zero with others
        
        for(int num: nums){
            if( (temp & num) != 0)
                bitmask2 ^= num;
        }
        return new int[]{bitmask2, bitmask ^ bitmask2};
    }
}
