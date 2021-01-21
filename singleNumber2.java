//Time Complexity - O(n)
//Space Complexity - O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        int a = 0;
        for(int num : nums){
            a = a ^ num;
        }
        int diff = a &(-a);
        int bitmask2 = 0;
        for(int num : nums){
            if((diff & num)!= 0){
                bitmask2 ^= num;
            }
        }
        return new int[]{bitmask2, bitmask2^a};
        
    }
}