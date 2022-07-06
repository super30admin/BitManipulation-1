using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BitManipulation
{
    class SingleNumberIII
    {
        /*
         * T.C: O(n) since interating through all the nums 
         * S.C: O(1)
         */
        public int[] SingleNumber(int[] nums)
        {
            if (nums == null || nums.Length == 0) return new int[] { };

            int xor = 0;

            foreach (int num in nums)
            {
                xor = xor ^ num;
            }

            int xor2 = 0;
            int temp = xor & (-xor);

            foreach (int num in nums)
            {
                if ((temp & num) != 0)
                {
                    xor2 = xor2 ^ num;
                }
            }

            return new int[] { xor2, xor ^ xor2 };
        }
    }
}
