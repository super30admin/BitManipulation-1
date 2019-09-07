/*//brute force A brute-force approach is to iteratively subtract y from x until what remains is less than y. The number of such subtractions is exactly the quotient, x / y, 
and the remainder is the term that's less than y the complexity of brute-force approach is very high.
*/
public class DivideTwoInteger {
	    //optimal tc log n where n is divisor
	
/*	//idea is left shift divisor till divisor less than divident. and keep counter for each leftshift.
 *if divisor greater than dividend then do substraction of both and waterver is the result if its less than original divisor and then return quotient= 2^counter else 
 *again initialize counter to 0 and repeat the process of subtraction,and add 2^counter in previous quotient value.
 * 15/3 
	15<3 yes then 15<6 ..15<12 shiftcount =2, quotient = 2^2=4  15-12 = 3 and 3-3 =0 shiftcount=0      so final quotient is 4+2^0=5*/
	        public int divide2(int dividend, int divisor) {
	            // handle special case 
	            if(dividend == Integer.MIN_VALUE && divisor == -1) {
	                return Integer.MAX_VALUE;
	            }
	            boolean shouldNegate = dividend > 0 ^ divisor > 0;
	            // Trick: use negative numbers instead of positive without using long because -Integer.MIN_VALUE will overflow but -Integer.MAX_VALUE will not. 
	            dividend = dividend > 0 ? -dividend : dividend;
	            divisor = divisor > 0 ? -divisor : divisor;
	            
	            int quotient = 0;
	            while(dividend <= divisor) {
	                int shiftCount = 0;
	                // (2 ^ shiftCount) * divisor
	                int multipleOfDivisor = divisor;
	                // Check if doubling multipleOfDivisor will overflow.
	                // Test case: -2147483648 / -2147483648 -> infinite loop
	                while(multipleOfDivisor << 1 < 0 && multipleOfDivisor << 1 > dividend) {
	                    multipleOfDivisor <<= 1;
	                    shiftCount++;
	                }
	                quotient += 1 << shiftCount;
	                dividend -= multipleOfDivisor;
	            } 
	            return shouldNegate ? -quotient : quotient;
	        }
	    
}
