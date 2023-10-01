// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

//We will use Rabin Karp algorithm to find the value of each substring found. We will maintain two hashsets, 
// allsubs and result to store the substring found. We have only 4 different character here, so we can assign a value to each character and calculate its value. 
// Whenever there is an incoming character, we will subtract the contributing value of the outgoing character from the hash value. 
// Then, we will check in the hashset if that value was already found in it, if yes, then we add it to the result set, otherwise we add it to the allsubs hashset.

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10) return new ArrayList<>();
        HashSet<String> result=new HashSet<>();
        HashSet<Long> allSubs=new HashSet<>();
        HashMap <Character, Integer> map=new HashMap<>();
        map.put('A',1); map.put('C',2); map.put('G',3); map.put('T',4);
        long hash=0l; 
        long kl=(long)Math.pow(4,9);
        for(int i=0;i<s.length();i++)
        {
            //outgoing character can only be calculated after i completes 10 characters
            if(i>=10)
            {
                char out=s.charAt(i-10);
                hash=hash-map.get(out)*kl;
            }
            //incoming 
            char in=s.charAt(i);
            hash=hash*4+map.get(in);

            if(allSubs.contains(hash))
            {
                result.add(s.substring(i-9,i+1));
            }
            else
            {
                allSubs.add(hash);
            }
        }

        return new ArrayList<>(result);
    }
}


//Using 2 HashSets

// We can maintain two hashsets, one for storing all the substring with size 10, and whenever we add a duplicate substring already in this hashset, we will add it to another hashset which is the result List. We will use sliding window of size 10 to find the substrings.

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10) return new ArrayList<>();
        HashSet<String> result=new HashSet<>();
        HashSet<String> allSubs=new HashSet<>();
       
       for (int i=0;i<s.length()-9;i++)
       {
           String sub=s.substring(i,i+10);

           if(allSubs.contains(sub))
           {
               result.add(sub);
           }
           else
           {
               allSubs.add(sub);
           }
       }

     
        return new ArrayList<>(result);
    }
}