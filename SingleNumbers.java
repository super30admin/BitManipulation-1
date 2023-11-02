// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. We will use bit manipulation to solve this problem.
// 2. We will use XOR operator to solve this problem.
// 3. We will use a for loop to iterate over the array.
// 4. Inside for loop, we will XOR the ans with the array element at i. 
// 5. We will return the ans.


public class SingleNumbers {
    public static void main(String[] args) {
        SingleNumbers obj = new SingleNumbers();
        System.out.println(obj.singleNumber(new int[]{2,2,1})); // expected output: 1
        System.out.println(obj.singleNumber(new int[]{4,1,2,1,2})); // expected output: 4
    }
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans;   
    }
}
