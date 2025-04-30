/*
TC : O(n)
SC : O(1)
*/
class Solution
{
public:
    int singleNumber(vector<int> &nums)
    {
        if (nums.size() == 1)
        {
            return nums[0];
        }

        int result = nums[0];

        for (int i = 1; i < nums.size(); i++)
        {
            result ^= nums[i];
            cout << result << endl;
        }

        return result;
    }
};