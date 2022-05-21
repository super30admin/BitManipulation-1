// Time Complexity : O(n) where n is the length of given string for traversing
// Space Complexity : O(n) for maintaining hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Assign bits to A,C,G,T as 00, 01, 10 & 11. 
// We will now build bitcode and will be able to identify the sequence uniquely
// For next sequence we can left shift twice and add current bits representing the neucliotide
// and use & to make the most significant charater's bits 0 so as to eliminate it.
// We will maintain a map to keep the count of sequence
// If we find any sequence occuring 2 times we will add it to the result list.
// At the end we will return the result.
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Map<Character, Integer> charToBitMap = new HashMap<>();
        charToBitMap.put('A', 0);
        charToBitMap.put('C', 1);
        charToBitMap.put('G', 2);
        charToBitMap.put('T', 3);
        
        List<String> result = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int bitCode = 0;
        
        for(int i=0; i<s.length(); ++i) {
            
            bitCode = bitCode<<2;
            bitCode += charToBitMap.get(s.charAt(i));
            
            if(i>=9) {
                
                bitCode = bitCode & ((1<<20) - 1);
                
                int currFreq = map.getOrDefault(bitCode, 0);
                
                if(currFreq == 1) {
                    result.add(s.substring(i-9, i+1));
                }
    
                map.put(bitCode, currFreq+1);
            }
        }
        
        return result;
    }
}