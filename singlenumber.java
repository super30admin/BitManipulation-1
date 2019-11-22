//Time Complexity:O(N)
//Space Complexity:O(1)
//Approach- Iterate over the array once. Take XOR of res with all the numbers in the array. The result at the end of the iteration will be the answer because taking XOR of a number twice will return 0 and so taking XOR of a unique value in the array will remain that value itself. 
//This code was executed successfully and got accepted in leetcode.
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}