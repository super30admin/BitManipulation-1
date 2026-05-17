// Time Complexity : O(N - L), O(N) if L=10
// Space Complexity : O(N - L)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
We use Rabin Karp's rolling hash algo here. We assign numbers to the input chars in a map and initialize them
in an array depending upon the input string by leveraging the map and their values. Later, maintain 2 sets,
one for adding computed hashes and whenever we see a repetitive hash, we add the substring to the output set.
If start is 0, we compute the hash of first sequence from 0 to L. If not, we compute rolling hash from the
previous hash value.
 */
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, n = s.length();
        if(n <= L)
            return new ArrayList<>();

        int a = 4, aL = (int)Math.pow(a, L);

        int[] nums = new int[n];
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        for(int i = 0 ; i < nums.length ; i++) {
            nums[i] = map.get(s.charAt(i));
        }
        int h = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();
        for(int start = 0 ; start < n - L + 1 ; start++) {
            if(start != 0) {
                h = h * a - nums[start - 1] * aL + nums[start + L - 1];
            }
            else {
                for(int i = 0 ; i < L ; i++) {
                    h = h * a + nums[i];
                }
            }
            if(seen.contains(h))
                output.add(s.substring(start , start + L));
            seen.add(h);
        }
        return new ArrayList<>(output);
    }
}