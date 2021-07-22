/*Running Time Complexity: O(n)
Space Complexity: O(n)
Successfully Run and Compiled on leetcode
*/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> map = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        for(int i =0;i<=s.length()-10;i++){
            String sub = s.substring(i,i+10);
            if(map.contains(sub)){
                res.add(sub);
            }
            map.add(sub);
        } 
    return new ArrayList<>(res);
    }

}