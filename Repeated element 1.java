//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for (int n : nums){
            a ^=  n;//XOR of two same number is always 0.
        }
        return a;
    }
}