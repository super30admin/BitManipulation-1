//TC : O(N)
//SC : O(1)


class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0)    return new int[0];
        
        int answer = 0;
        
        for(int n : nums){
            answer ^= n;
        }        //Doing XOR will eliminate number which are repeating

        
        //Answer willl be containing p ^ q, we have to find p and q
        int temp = answer & (-answer);
        //AND of XOR's result and doing AND between that result and its compliment
        int mask = 0;
        for(int n : nums){
            if((temp & n) != 0){ // Do AND will input number, if it is >0 add that number into bitmask
                mask ^= n;
            }
        }
        
        return new int[]{mask, mask ^ answer};
    }
}
