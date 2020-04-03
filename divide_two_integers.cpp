//Time Complexity-O(logn)---->'n' will be absolute value of dividend
//Space Complexity-O(1)
//Did the execute on Leetcode? Yes

class Solution {
public:
    int divide(int dividend, int divisor) {
        if(divisor==0)
        {
            return INT_MAX;
        }
        if(divisor==-1 && dividend==INT_MIN)
        {
            return INT_MAX;
        }
        if(divisor==1 && dividend==INT_MIN)
        {
            return INT_MIN;
        }
        long tempdivisor=abs(long(divisor));
        long tempdividend=abs(long(dividend));
        int res=0;
        while(tempdividend>=tempdivisor)
        {
            int nums=0;
            while(tempdividend>=(tempdivisor<<nums))
            {
                nums++;
            }
            nums--;
            tempdividend=tempdividend-(tempdivisor<<nums);
            res+=1<<nums;
        }
        if(divisor>0 && dividend>0 || divisor<0 && dividend<0)
        {
            return res;
        }
        else
        {
            return -res;
        }
    }
};