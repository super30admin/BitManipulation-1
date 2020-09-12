class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        if(s == "" || s.length()<=10)   return list; 
        map.put(s.substring(0,10),1);
        for(int i = 1;i<=s.length()-10;i++){
            if(map.containsKey(s.substring(i,i+10))) {
                if(map.get(s.substring(i,i+10))<2)
                    list.add(s.substring(i,i+10));
                map.put(s.substring(i,i+10),map.get(s.substring(i,i+10))+1);
            }  
            else map.put(s.substring(i,i+10),1);
        }
        return list;
    }
}
