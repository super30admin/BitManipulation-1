class SingleNumberII {
    public int[] singleNumber(int[] nums) {
        int bitmask=0;
        for(int num: nums)
        {
            bitmask^=num;
        }

        int lsb = bitmask & (-bitmask);
        int bitmask2=0;
        for(int num:nums)
        {
            if((num & lsb)!=0)
            {
                bitmask2^=num;
            }
        }
        return new int[]{bitmask2, bitmask2^bitmask};

    }
}

//tc:O(n)
//sc:O(1)