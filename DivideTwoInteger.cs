using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BitManipulation
{
    /*
     * T.C: O(1) as the loop will at max run for 31 times
     * S.C: O(1) 
     */
    public class DivideTwoInteger
    {
        public int Divide(int dividend, int divisor)
        {
            if (dividend != 0 && divisor == 0) return int.MaxValue;
            if (dividend == int.MinValue && divisor == -1) return int.MaxValue;

            long ldividend = Math.Abs((long)dividend);
            long ldivisor = Math.Abs((long)divisor);
            int result = 0;


            while (ldividend >= ldivisor)
            {

                int shift = 0;
                while (ldividend >= (ldivisor << shift))
                {
                    shift++;
                }
                shift--;
                result = result + (1 << shift);
                ldividend = ldividend - (ldivisor << shift);

            }

            if (dividend > 0 && divisor < 0) return -result;
            if (dividend < 0 && divisor > 0) return -result;

            return result;
        }
    }
}
