187. Repeated DNA Sequences


TC -O(n)
SC - O(n)

class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {

        map<string ,int>mp;
          string x="";

         vector<string>ans;
        for(int i =0 ;i < s.size() ; i++)
        {
            x+=s[i];

            if(x.size()==10)
            {
                if(mp[x]==1)
                     ans.push_back(x);
                     mp[x]++;
              x=x.substr(1,x.size());
            }

        }
        return ans;
        
    }
};
