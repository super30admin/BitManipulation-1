class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        for (int i=0;i<nums.length;i++) {
            single = single^nums[i];
        }

        return single;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for (int num:nums) {
            xor = xor^num;
        }
        int twoscomp = xor & (-xor);
        int xor2=0;
        for (int num:nums) {
            if ((num & twoscomp) != 0 ){
                xor2 = xor2^num;
            }
        }

        return new int[]{xor2, xor^xor2};
    }
}
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hs = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i=0;i<=s.length()-10;i++) {
            String substr = s.substring(i,i+10);
            if (hs.contains(substr)) {
                result.add(substr);
            }
            hs.add(substr);
        }
        return new ArrayList<String>(result);
    }
}
