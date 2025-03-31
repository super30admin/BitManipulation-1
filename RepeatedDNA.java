class Solution {
    //Time Complexity:O(n)
    //Space Complexity:O(n)
    public List<String> findRepeatedDnaSequences(String s) {

        HashSet<String> checkedString = new HashSet<>();
        HashSet<String> secondCheck = new HashSet<>();
       List<String> res = new ArrayList<>(); 
                
        for (int i = 0; i <= s.length()-10;i++){
            String ss = s.substring(i,i + 10);
            if (!checkedString.contains (ss)){
                checkedString.add(ss);
            } else {
                if(!secondCheck.contains(ss))
                res.add(ss);
                secondCheck.add(ss);
            }
        }
                return res;
    }

}
