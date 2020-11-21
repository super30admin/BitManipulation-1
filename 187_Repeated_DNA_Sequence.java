    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/repeated-dna-sequences/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(n) 
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. Take the XOR of each element
              2. XOR will nullfiy each pair that is repaeating at the end we will have anser.
              3. return x.
    */  

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        for(int i = 0;i <= s.length()-10; i++){
            String sub_string = s.substring(i, i+10);
            
            if(hashSet.contains(sub_string)){
                output.add(sub_string);
            }else{
                hashSet.add(sub_string);
            }
        }
        
        return new ArrayList<>(output);
    }
}