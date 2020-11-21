    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/single-number/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Hashset add for first time and delete for second time. 
                           At the end, only one element will ramine in the array
        # Optimized approach: 
                              
            # 1. Take the XOR of each element
              2. XOR will nullfiy each pair that is repaeating at the end we will have anser.
              3. return x.
    */  

class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        
        for(int num : nums){
            x = x ^ num;
        }
        
        return x;
    }
}