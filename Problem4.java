/*
187. Repeated DNA Sequences
Ran on leetcode: Yes
TC: O(n) SC: O(n)
Using Robin Karp algorithm, calculate hash for window of size 10 using the base as 4 because we have 4 different characters, when we have window of size 10 check if we have seen the hash if we have seen then add to result or add to the visit set. For calculating hash add the incoming character hash = hash * base(4) + weight_for_letter and when the size of window is more than 10 remove the weight of leftmost character
*/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Long> hashSet = new HashSet<>(); // Keep track of hash
        Set<String> result = new HashSet<>(); // Result

        Map<Character, Integer> sIdx = Map.of( // For weights of each character
            'A', 1,
            'C', 2,
            'G', 3,
            'T', 4
        );

        int sLen = s.length();

        long outgoing = (long)Math.pow(4, 10);

        long hash = 0;

        for(int i = 0; i < sLen; i++){
            
            hash = hash * 4 + sIdx.get(s.charAt(i)); // calculate the hash for the incoming character

            if(i >= 10){ // If window size is more than 10
                hash = hash - (sIdx.get(s.charAt(i - 10)) * outgoing);
            }

            if(i >= 9){ // window size is 10
                if(hashSet.contains(hash)){ // Check if we have seen this hash earlier
                    result.add(s.substring(i - 9, i + 1)); // Add to result
                } else { // If we have not seen the window earlier
                    hashSet.add(hash);
                }
            }
        }

        return new ArrayList<>(result);
    }
}