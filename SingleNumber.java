//xor operation in java if we add same no result is 0 and if we xor 0 and number then answer is that itself.
//tc:o(n)
//sc:o(1)
public class SingleNumber {
	    public int singleNumber(int[] nums) {
	        int result =0;
	        for(int i =0;i<nums.length;i++){
	            result ^=nums[i]; //xor operation a^= 0= a and a^= a = a
	        }
	        return result;
	    }
}
