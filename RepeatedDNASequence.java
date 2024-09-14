// time complexity:O(n)
//space complexity: O(n)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
         HashSet<String> allSubStrings = new HashSet<>();

        HashSet<String> result = new HashSet<>();

        for(int i=0; i<=s.length()-10; i++){

            String currentSubString = s.substring(i,i+10);

            if(allSubStrings.contains(currentSubString))result.add(currentSubString);

            allSubStrings.add(currentSubString);

        }

        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        RepeatedDNASequence solution = new RepeatedDNASequence();

        // Test case 1
        String dna1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println("Repeated sequences: " + solution.findRepeatedDnaSequences(dna1));
        // Output: [AAAAACCCCC, CCCCCAAAAA]

        // Test case 2
        String dna2 = "AAAAAAAAAAAAA";
        System.out.println("Repeated sequences: " + solution.findRepeatedDnaSequences(dna2));
        // Output: [AAAAAAAAAA]

        // Test case 3
        String dna3 = "ACGTACGTACGTACGTACGT";
        System.out.println("Repeated sequences: " + solution.findRepeatedDnaSequences(dna3));
        // Output: []
    }
}

