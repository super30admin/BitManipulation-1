// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        
        int bitmask1 = 0;
        
        // XOR all the elements
        for (int i= 0; i < nums.length ; i++){
            bitmask1 = bitmask1 ^ nums[i];
        }
        
        
        // property 
        // One unique element will give this operation as 0 
        // Other unique element will have non - zero values
        int temp =  bitmask1 & (-bitmask1);
        
        int bitmask2 = 0;
        
        // Filter out the elements that have bitmask2 as 0
        
        for (int i = 0; i < nums.length ; i++){
            
            // All the other paired elements whose value of bitmask2 is 0 will be nullified by XOR . The result will end up in one of the unique elements.
            if ((temp & nums[i]) == 0){
                
                bitmask2 = bitmask2 ^ nums[i];
            }
        }
        
        return new int[]{bitmask2, bitmask1 ^ bitmask2};
    }
}