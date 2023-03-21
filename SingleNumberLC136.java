class Solution {

    //Approach: XOR with the same number result in a 0, so here every number is repeated twice except one number, so we are doing XOR with all numbers, number which is repeated twice will cancel each other and we left with only one number that's our answer

    //Time Complexity: O(n)
    //Space Complexity: O(1)

    public int singleNumber(int[] nums) {

        int bitmask = 0;
        for(int num: nums){
            bitmask = bitmask ^ num;
        }
        return bitmask;
    }



    // public int singleNumber(int[] nums) {

    //     if(nums.length==1)
    //     {
    //         return nums[0];
    //     }
    //     else{
    //         Arrays.sort(nums);
    //         int i=0;
    //         int j=1;
    //         for(;i<nums.length & j<nums.length;i=i+2,j=j+2)
    //         {
    //             if(nums[i]!=nums[j])
    //             {
    //                 return nums[i];
    //             }
    //         }
    //         return nums[i];
    //     }
    // }
}


public class SingleNumberLC136 {
}
