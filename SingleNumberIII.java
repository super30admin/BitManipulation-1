class Solution {
    public int[] singleNumber(int[] nums) {
        int xorRes = 0;
        
        for(int num : nums){
            xorRes = xorRes ^ num;
        }
        
        int right = xorRes & (-xorRes);
            
        int x = 0;
        for(int num : nums){
            if((num & right) == 0){
                 x = x ^ num;
            }
        }   
        
        return new int[]{x, x^xorRes};
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)