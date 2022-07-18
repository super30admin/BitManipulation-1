/* 
    Time Complexity                              :  O(N - L)
    Space Complexity                             :  rollingHashap - O(N-1) ~= O(N)
                                                    rabinKarp - O(2*(N-1)) ~= O(N)
                                                    bitManipulation - O(2*O(N-1)) ~= O(N)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
    int L, n;
    
        
public:
    vector<string> findRepeatedDnaSequences(string s) {
        L = 10;
        n = s.length();
        
        
        if(n < 10) {
            return vector<string>();
        }
        // vector<string> ans1 = rollingHashmap(s);
        // return ans1;
        
        // vector<string> ans2 = rabinKarp(s);
        
        vector<string> ans3 = bitManipulation(s);        
        return ans3;
    }
    
    vector<string> rollingHashmap(string s) {
        unordered_map<string,int> mp;
        string rolling = "";
        vector<string> ans;
        for(int i=0;i<L;i++) {
            rolling += s[i];
        }
        
        for(int j=L;j<s.length();j++) {
            // cout << rolling << "\n";
            mp[rolling]++;
            rolling = rolling.substr(1) + s[j];
            if(mp.find(rolling) != mp.end() and mp[rolling] == 1) {
                ans.push_back(rolling);
            }
        } 
        
        return ans;
    }
    
    vector<string> rabinKarp(string s) {
         
        unordered_map<char,int> mp;
        mp['A'] = 0, mp['T'] = 1, mp['G'] = 2, mp['C'] = 3;
        
        long long int h = 0;
        long long int a = 4;
        int exp = pow(4,L);
        unordered_set<int> seen;
        unordered_set<string> duplicates;
        
        for(int i=0;i<n - L + 1;i++) {
            
            
            if(i != 0) {
                char removeChar = s[i-1];
                char addChar = s[i+L-1];
                h = h * a - mp[removeChar] * exp + mp[addChar];
            } else {
                for(int j=0;j<L;j++) {
                    char currChar = s[j];
                    h = h * a + mp[currChar];      
                }
            }
            
            if(seen.find(h) != seen.end()) {
                duplicates.insert(s.substr(i,10));
            }
            seen.insert(h);
        }
        
        vector<string> ans;
        for(auto str : duplicates) {
            ans.push_back(str);
        }
        
        return ans;
    }
    
    vector<string> bitManipulation(string s) {
        int bitmask = 0;
        int i = 0;
        
        unordered_map<char,int> mp;
        mp['A'] = 0, mp['T'] = 1, mp['G'] = 2, mp['C'] = 3;
        
        unordered_set<int> seen;
        unordered_set<string> duplicates;
        
        while(i < L) {
            bitmask <<= 2;
            bitmask |= mp[s[i]];
            i++;
        }
        
        seen.insert(bitmask);
        i = 1;
        while(i < n - L + 1) {
            
            bitmask <<= 2;
            bitmask |= mp[s[i + L - 1]];
            bitmask &= ~(3 << 2*L);
            if(seen.find(bitmask) != seen.end()) {
                duplicates.insert(s.substr(i,L));
            }
            seen.insert(bitmask);
            
            i++;
        }
        
        
        vector<string> vec(begin(duplicates),end(duplicates));
        return vec;
        
    }
};