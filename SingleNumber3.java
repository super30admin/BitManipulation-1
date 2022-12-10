//Time  -O(n)
//Space - O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int key1 = nums[0];
        for(int i=1; i<nums.length; i++){
            key1 = key1^nums[i];
        }
        int temp = key1 & -key1;
        int key2 =0;
        for(int j=0; j<nums.length; j++){
            if((temp & nums[j]) !=0){
                key2^=nums[j];
            }
        }
        return new int[]{key2, key1^key2};
    }
}