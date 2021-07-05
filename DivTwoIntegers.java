class Solution {
    public int divide(int dividend, int divisor) {
        long dd=Math.abs(dividend);
        long dr=Math.abs(divisor);
        if(dd==0){
            return 0;
        }
        dd=Math.abs(dd);
        dr=Math.abs(dr);
        System.out.println(dd);
           System.out.println(dr); 

        long cnt=0;
        while(dr<=dd){
            dd-=dr;
            cnt++;
            
        }
        System.out.println(cnt);
        
        if(dividend<0 && divisor<0){
            if(cnt>2147483647)
               return 2147483647;  
           else return (int)cnt;
        }
        else if(dividend<0 || divisor<0){
            return (int)cnt*-1;
        }
        
        else return (int)cnt;
        
    }
}
