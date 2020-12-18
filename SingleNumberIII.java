// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// use xor to get combined nums
// get rightmost set bit from the combined num and find which num is setting it
// inorder to remove duplicates, xor with the number after checking if num sets rightmost bit
// finally get firstNum and secoundNum would be combined^firstNum 

class Solution {
    public int[] singleNumber(int[] nums) {
        int combined = 0;
        
        for(int num : nums){
            combined ^= num;
        }
        
        int rightmost = combined & -combined;
        
        int firstNum = 0;
        for(int num : nums){
            if((num & rightmost)>0){
                firstNum ^= num;    
            }
        }
        
        int secondNum = combined^firstNum;
        
        return new int[]{firstNum, secondNum};
    }
}