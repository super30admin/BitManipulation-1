// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


// use a set to find the repeated substring of length 10.
// use another set to store the answer .
// atlast copy ans into a vector and return.


class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {
        unordered_set<string>set;
        unordered_set<string>ans;
        int n = s.size();
        for(int i = 0;i<=n-10;i++){
            string p = s.substr(i,10);
            if(set.find(p)!=set.end()){
                ans.insert(p);
            }
            else{
                set.insert(p);
            }
        }
        vector<string>result;
        
        for(auto & s: ans){
            result.push_back(s);
        }
        return result;
    }
};