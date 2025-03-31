class Solution {
    //Time Complexity:O(n)
    //Space Complexity:O(1)
    // Logic: To find a number that stands out, we basically xor through every number
    // as all repeating numbers cancel each other out 

    //XOR Truth table
    // 0 : 0  = 0
    // 1 : 0  = 1
    // 0 : 1  = 1
    // 1 : 1  = 0
    public int singleNumber(int[] nums) {
        
        int xor = 0;

        for (int num:  nums){
            xor = xor ^ num;
        }
        return xor;
    }
}
