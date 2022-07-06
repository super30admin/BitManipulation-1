using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BitManipulation
{
    public class SingleNumber
    {
        /*
         * T.C: O(n) where n is number of element in the number
         * S.C: O(1) since no other data structure used
         */
        public int SingleNumber1(int[] nums)
        {
            if (nums == null || nums.Length == 0) return 0;

            int xor = 0;

            foreach (int num in nums)
            {
                xor = xor ^ num;
            }

            return xor;
        }
    }
}
}
