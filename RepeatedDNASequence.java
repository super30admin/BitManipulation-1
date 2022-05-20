import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
Time Complexity: O(N), N is the size of the input string
Space Complexity: O(N), N is the HashSet
Any difficulties: no
Run on Leetcode: Yes

Approach:
1.As given in the question, I am expected to make a string of 10 characters I would be using substring method to create
that, and then I would be adding that in to the hashset if that does not exist already
 */
public class RepeatedDNASequence {
    public static List<String> repeatedDNASequence(String s){
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList(repeated);
    }
    public static void main(String[] args){
        System.out.println("Repeated DNA Sequence: "+ repeatedDNASequence("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}
