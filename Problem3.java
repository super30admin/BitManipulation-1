/* 
260. Single Number III
Ran on leetcode: Yes
TC: O(n) SC: O(1)
In first pass take XOR of all the numbers we remain with XOR of 2 numbers, find the least significant bit, in second pass find the single number with that least significant bit set, this one of our answer find XOR between this and the other number and we have both the numbers
*/
class Solution {
    public int[] singleNumber(int[] nums) {
        
        // Find the XOR of both the single numbers 
        int bitMask1 = 0;
        for(int num: nums){
            bitMask1 = bitMask1 ^ num;
        }

        // Find the rightmost set bit ie the least significant bit which differes between them
        int lsb = bitMask1 & (-bitMask1); // Find the 2's compliment and find and on them to find the right most set bit

        int bitMask2 = 0;
        for(int num: nums){
            if((num & lsb) != 0){ // Find the single number with that bit set
                bitMask2 = bitMask2 ^ num;
            }
        }

        return new int[]{bitMask2, bitMask1 ^ bitMask2}; // Since we have one number we have other
    }
}