//Time Complexity : O(log n); where n is absolute value of dividend.
//Space Complexity : O(1)

public class DivideTwoIntegers { 
	/**Approach: Bitwise operators**/
	public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int res= 0;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        while(ldividend >=  ldivisor){
            int shiftCnt=1; 
            while(ldividend >  (ldivisor << shiftCnt)){ // 25/4
                shiftCnt++;
            }
            shiftCnt--;
            res += 1 << shiftCnt; // 2pow2
            ldividend = ldividend - (ldivisor << shiftCnt);                
        }
        if(dividend > 0 && divisor > 0) return res;
        if(dividend < 0 && divisor < 0) return res;
        return -res;
    }
	
	// Driver code to test above
	public static void main (String[] args) {	
		DivideTwoIntegers ob  = new DivideTwoIntegers();	
		int dividend = 7;//10;
		int divisor = -3;//3;
		
		System.out.println("Quotient after dividing dividend by divisor is: "+ ob.divide(dividend, divisor));         
	}	
}
