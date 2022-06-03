class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0)    return 0;
        
        int answer = 0;
        
        for(int n : nums){
            answer ^= n;
        }
        //Doing XOR will eliminate number which are repeating
        return answer;
    }
}