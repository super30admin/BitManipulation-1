class Problem3 {
    //TC:O(N)
    public int[] singleNumber(int[] nums) {

        int bitmask1=0;
        int bitmask2=0;

        for(int num:nums){
            bitmask1 = bitmask1^num;
        }
        int twosComplement = (~bitmask1 +1);
        int lsb =  bitmask1 & twosComplement;

        for(int num: nums){
            if((lsb & num) != 0){
                bitmask2 = bitmask2 ^ num;
            }
        }

        return new int[]{bitmask2,bitmask2^bitmask1};
    }
}