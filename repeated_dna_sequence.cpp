// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {
        
        int len = s.length();
        
        vector<string> ret_vect;
        
        if(len < 10)
            return ret_vect;
        
        set<string> set_str;
        set<string> set2;
        set<string>::iterator itr;
        
        int i, j;
        
        for(i = 0; i <= len-10; i++)
        {
            string temp_str;
            for(j = 0; j < 10; j++)
                temp_str += s[i+j];
            
            // Not present
            if(set_str.find(temp_str) == set_str.end())
                set_str.insert(temp_str);
            // Present already
            else
                set2.insert(temp_str);
        }
        
        // Convert the sets to return vector
        for(itr = set2.begin(); itr != set2.end(); itr++)
            ret_vect.push_back(*itr);

        return ret_vect;
    }
};