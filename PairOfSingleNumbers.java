//TC O(n)
//SC O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int size = nums.length;
        int xor = nums[0];
        for(int i = 1 ; i < size ; i++) {
            xor = xor ^ nums[i];
        }
        int lowBit = xor & (-xor); // return lowest bit
        int a = 0, b = 0;
        for(int i = 0 ; i < size ; i++) {
            if((nums[i] & lowBit) == 0){
                a = a ^ nums[i];
            }else{
                b = b ^ nums[i];
            }
        }
        return new int[]{a,b};
    }
}