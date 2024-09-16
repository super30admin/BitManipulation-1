class SingleNumber {
  // TC : O(n) n - nums.length
  // SC : O(1)
  public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = 0;
        for(int i=0;i < nums.length; i++){
            result = result ^ nums[i]; //xor operator
        }
        
        return result;
    }
}  
