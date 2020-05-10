//Problem 2
//Single number (https://leetcode.com/problems/single-number/)

// Brute Force
// Time complexity - O(n)
// SPace complexity - O(n)
class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        
        if(!set.isEmpty()){
            for(int num: set){
                return num;
            }
        }
        
        return -1;
        
    }
}

// Optimised - Bit Manipulation
// Time complexity - O(n)
// SPace complexity - O(1)
class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int res = 0;
        for(int num: nums){
            res ^= num;
        }
        
        return res;
        
    }
}

