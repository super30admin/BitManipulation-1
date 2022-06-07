//Time Complexity : O(n); where n is length of nums array.
//Space Complexity : O(1)

public class SingleNumber_III { 	
	/**Approach: Bitwise operators**/
	public int[] singleNumber(int[] nums) {        
        //Take XOR to return the sum of two single numbers in array
        int bitmask = 0; // X+Y
        for(int num: nums){
            bitmask ^= num;
        }        
        //take 2's compliment 
        int temp = bitmask & (-bitmask);        
        //Take XOR with 2'compliment to find non-negative number i.e. either X or Y
        int bitmask2 = 0; 
        for(int num: nums){
            if((num & temp) !=0){
                bitmask2 ^= num;
            }            
        }
        //X= bitmask2
        //Y= bitmask2 XOR bitmask
        return new int[]{bitmask2, bitmask2 ^ bitmask};
    }
	
	// Driver code to test above
	public static void main (String[] args) {	
		SingleNumber_III ob  = new SingleNumber_III();	
		int[] nums= {1,2,1,3,2,5};
		
		System.out.println("Pair of single numbers in given array is : "+ 
				Arrays.stream(ob.singleNumber(nums)).boxed().collect(Collectors.toList()));          
	}	
}
