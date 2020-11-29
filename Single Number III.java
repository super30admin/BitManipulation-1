//Time Complexity-O(n)
//Space Complexity-O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int num:nums)
        {
            x=x^num;
        }
        int rightmost=x&(-x);
        int output=0;
        for(int num:nums)
        {
            if((rightmost&num)!=0)
            {
                output=output^num;
            }
        }
        return new int[]{output,x^output};
    }
}