class Solution {
    public int singleNumber(int[] nums) {
        // Tc: O(n) Sc: O(1)
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}

/*
 * class Solution {
 * public int singleNumber(int[] nums) {
 * //Tc: O(n) Sc: O(n)
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for(int i : nums)
 * {
 * map.put(i, map.getOrDefault(i, 0)+1);
 * }
 * 
 * for(int i:nums)
 * {
 * if(map.get(i) == 1) return i;
 * }
 * return 0;
 * }
 * }
 */