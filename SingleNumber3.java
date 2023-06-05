public class SingleNumber3 {
    // TC = O(n) SC = O(1)
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;
        for(int i=0;i<nums.length;i++){
            bitmask1 ^= nums[i];
        }
        int temp = bitmask1 & (-bitmask1);
        int bitmask2 = 0;
        for(int i=0;i<nums.length;i++){
            if((temp & nums[i]) != 0){
                bitmask2 ^= nums[i];
            }
        }
        int num1 = bitmask2;
        int num2 = bitmask2 ^ bitmask1;
        return new int[]{num1,num2};
    }
}
