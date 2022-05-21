// Time Complexity : O(n) n length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] singleNumber(int[] nums) {
        int twoNos = 0;
        //this will give the no. with information of two single nos.
        for(int x: nums){
            twoNos ^= x;
        }
        int grp1 = 0, grp2 = 0;
        // For the information of 2 nos. to be stored there must be atleast 1 bit
        // which has to be different in those two nos.
        //get rightmost 1 different bit
        //the negative of a no. is 2's complement
        //When we do & the varying bit would be revealed
        int difBit = twoNos & (-twoNos);
        //Here we will divide the nos in two groups, one nos which has 0 at the difBit position
        //Another with 1s. Since other nos. are in pairs they would cancel out and we will be left
        //With our two single nos. in two seperate groups.
        for(int x: nums){
            if((x & difBit) != 0)
                grp1 ^= x;
            else
                grp2 ^= x;
        }
        return new int[]{grp1, grp2};
    }
}