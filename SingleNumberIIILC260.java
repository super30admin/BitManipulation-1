class Solution {

    //Time Complexity: O(n)
    //Space Complexity: O(1)

    public int[] singleNumber(int[] nums) {

        int bitmask = 0;
        for(int i =0; i< nums.length; i++){         //iterate through nums
            bitmask = bitmask ^ nums[i];               //take XOR with every number
        }

        int temp = bitmask & (-bitmask);            //take and between bitmask and 2's compliment of that bitmask which gives us the lease significant bit between 2 number that have to find

        int bitmask2 = 0;

        for(int i=0; i<nums.length; i++){           //iterate through nums again

            if((nums[i] & temp) != 0){              // take and between nums[i] and temp, from 2 numbers that we have to find, one number gives 0 and other number not result in 0, so thats how we get one number from 2 numbers and 2nd number we get from taking XOR between 1st number and bitmask
                bitmask2 = bitmask2 ^ nums[i];
            }
        }
        return new int[]{bitmask2, bitmask2 ^ bitmask};

    }
}


public class SingleNumberIIILC260 {
}
