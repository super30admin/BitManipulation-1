class Solution {

    //Time Complexity: 0(n) where n is the no of elements in nums array
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problem while coding: No

    //In brief explain your approach

    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int []{};
        }

        int xor = 0;    //to get 1 unique no. of out 2

        for(int num : nums){
            xor = xor ^ num;
        }//after the for loop, I will have one no. out of the 2 that is not repeated

        int temp = xor & (-xor);    //I am storing the and operation of the unique no. and it's 2 compliment in temp.
        //When I perform an and operation with temp and the num, if it is same, I will get 0 and if not, I will get 1. Meaning, if the no's are repeated, I will get 0 and if unique, I will get 1
        int xor2 = 0;   //I go again through my nums array and just get the unique no. again

        for(int num: nums){
            if((temp & num) != 0){
                xor2 = xor2 ^ num;
            }
        }

        return new int[]{xor2, xor ^ xor2}; //xor2 is one of the unique no's and when I do a XOR operation between the previous unique no and the 2nd unique no. I get the other unique no.
    }
}