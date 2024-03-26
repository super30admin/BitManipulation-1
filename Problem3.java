class Solution {
    //Time Complexity: O(n)

    //Space Complexity: O(1)
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num : nums){
            bitmask ^= num;
        }
        int temp = bitmask & (-bitmask);  //and with 2's complement of bitmask
        int bitmask2 = 0;
        for(int num: nums){
            if((temp & num) != 0){
                bitmask2 ^= num;
            }
        }
        return new int[]{bitmask2, bitmask^bitmask2};
    }
}
