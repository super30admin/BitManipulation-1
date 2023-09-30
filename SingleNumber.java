package org.example;
// Time Complexity : O(2n) -> O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class SingleNumber {

    public int[] singleNumber(int[] nums) {

        int bitmask1 = 0;
        for(int num: nums){                 // bitmask1 is  the additoin of two unique numbers
            bitmask1 = bitmask1^num;
        }
        // take 2's comp of bitmask1 (& between number and its negative rrepresentaion)
        int lsb = bitmask1 & (-bitmask1);

        int bitmask2 = 0;
        // & between lsb and num in array -> identify one number bitmask2
        for(int num: nums){
            if((lsb & num) != 0){
                bitmask2 ^= num;
            }
        }

        return new int[]{bitmask2, bitmask1^bitmask2};
    }

    /*
      public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result = result^num;
        }
        return result;
    }
    * */
}
