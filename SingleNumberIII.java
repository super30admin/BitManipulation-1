// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    
      public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap();
        for (int n : nums)
          hashmap.put(n, hashmap.getOrDefault(n, 0) + 1);

        int[] output = new int[2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> item : hashmap.entrySet()){
          if (item.getValue() == 1) {
              output[idx++] = item.getKey();
          }
        }

        return output;
      }
}