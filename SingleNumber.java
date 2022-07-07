class Solution {

    //Time Complexity: 0(n) where n is the no of elements in nums array
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problem while coding: No

    //In brief explain your approach

    public int singleNumber(int[] nums) {

        if(nums == null || nums.length == 0){      //base case
            return 0;
        }

        int xor = 0;    //initially initializing xor as 0 or in bit term, 000

        for(int num : nums){    //going over all the numbers in num array
            xor = xor ^ num;    //I am performing a xor operation between the previous value of xor and the current no.
        }
        return xor; //after the loop, xor will hold the single number in the array. As when xor operation is performed between 2 no's, If ther are same, then my output is 0 and if different, then it is 1
    }
}