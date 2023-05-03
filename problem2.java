/*
We will take the Bitmaskl with all numbers

we will then take the 2's complement' of that Bitmask and call it twoComp

we wil then iterate over the array, and take AND of each element in with the 2's comp' and if the resultant value is non zero , we will XOR with the Bitmask2

Bitmask2 would contain one of the number and XOR with Bitmask1 will give us the next number

Time: O(n)
S: (1)

*/

class Solution {
    public int[] singleNumber(int[] nums) {

        int bitMask1 = 0;

        for(int i=0;i<nums.length;i++){
            bitMask1 ^= nums[i];
        }

        int twoComp = bitMask1 & (-bitMask1);
       // twoComp = twoComp + 1;

        int bitmask2 =0;

        for(int i=0;i<nums.length;i++){
            if((twoComp & nums[i]) != 0){
                bitmask2 ^= nums[i];
            }
        }

        return new int[]{bitmask2, bitMask1 ^ bitmask2}    ;    
    }
}