//TC O(N)
//SC O(N)

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        if (len < 11) return new ArrayList<>();
        
        // 00, 01, 10, 11 respectively for A, C, G, T
        Set<Integer> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int[] table = new int[26];
        table['C' - 'A'] = 1;
        table['G' - 'A'] = 2;
        table['T' - 'A'] = 3;
        
        int cur = 0;
        int mask = 0x000fffff;
        for (int i = 0; i < len; ++i) {
            cur <<= 2;
            cur |= table[s.charAt(i) - 'A'];
            if (i < 9) continue; //initialize
            cur &= mask;
            if (!seen.add(cur)) { //return true if not existed
                repeated.add(s.substring(i-9, i+1));
            }
        }
        
        return new ArrayList<>(repeated);
        
    }
}