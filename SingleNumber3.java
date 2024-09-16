public class SingleNumber3 {

    // TC : O(n) n - nums.length
    // SC : O(1)
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int xor = 0;

        for(int num : nums) {
            xor = xor ^ num;
        }

        int temp = xor & (-xor); // 2's complement
        int xor2 = 0;

        for(int num : nums) {
            if((temp & num) != 0){
                xor2 = xor2 ^ num;
            }
        }

        return new int[]{xor2, xor ^ xor2};
    }
}
