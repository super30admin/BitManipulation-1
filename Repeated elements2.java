//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int n : nums){
            x^=n;
        }
        int rightmost= x & (-(x));//finding the right most bit
        int r=0;
        for(int n : nums){
            if((n & rightmost)!=0){//right most bit and the elements will give either 0 or non zero
                r=r^n;       //all non zero when XOR together will eleiminate repeating
            }
        }
        
        return new int[]{r,x^r};
    }
}