// Time Complexity : O(n)
// Space Complexity : O(n)
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