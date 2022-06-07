//Time Complexity : O(n); where n is length of nums array.
//Space Complexity : O(1)
public class SingleNumber { 
	/**Approach: Bitwise XOR**/	
	public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
    }
	
	// Driver code to test above
	public static void main (String[] args) {	
		SingleNumber ob  = new SingleNumber();	
		int[] nums= {4,1,2,1,2};//{2,2,1};
		
		System.out.println("The single number in given array is : "+ ob.singleNumber(nums));         
	}	
}
