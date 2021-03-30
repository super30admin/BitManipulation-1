/*
TC: O(n)
SC: O(1)

*/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() == 0 || s == null){
            return new ArrayList<>();
        }
        
        HashSet<String> subs = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        
        for(int i = 0; i <= s.length()-10;i++){
            String curr = s.substring(i, i+10);
            if(subs.contains(curr)){
                res.add(curr);
            }
            subs.add(curr);
        }
        
        return new ArrayList<>(res);
    }
}