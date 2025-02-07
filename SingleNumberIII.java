// Approach : Instead of using extra space of HashSet. We can use XOR operation to find the single unique number from the array.
// Similarly to find  the second unique number we can do another bit mask. 
// Time : o(n)
// Space : o(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;
        for(int num : nums){
            bitmask1 = bitmask1 ^ num;
        } // [1,2,1,3,2,5]
        // bitmask1 will be combination of two unique numbers if we have ->  3,5
        // To Extract the second unique number we do another bitmask

        // To calculate diff -> perform bitmask1 AND 2's Compliment of bitmask1
        // 2's Compliment of bitmask1 is -bitmask1--> first take 1s Compliment and add 1
        int diff = bitmask1 & (-bitmask1); 
        // This diff AND with any num in array can be non negative integer or zero
        // If non-negative integer then XOR with bitmask2
       
        int bitmask2 = 0;
        for(int num:nums){
            if((diff & num) !=0){
                bitmask2 = bitmask2 ^ num;
            }
        }
        return new int[]{bitmask2 , bitmask2 ^ bitmask1};
    }
}