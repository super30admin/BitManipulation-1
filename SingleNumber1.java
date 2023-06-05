public class SingleNumber1 {
    // TC = O(n) SC = O(1)
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
