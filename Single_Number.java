class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        
        for(int num: nums){
            bitmask ^= num;
        }
        
       return bitmask;
    }
}

//TC: O(n)
//SC: O(1)
