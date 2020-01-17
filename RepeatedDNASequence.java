import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//tc o(1)
//sc O(n)
//use set to store all substring and result hashset to store substring which are repeating.

public class RepeatedDNASequence {
	    public List<String> findRepeatedDnaSequences(String s) {
	        HashSet<String> allSubstrings = new HashSet<>();
	        HashSet<String> result = new HashSet<>();
	        for(int i=0;i<s.length()-9;i++){
	            System.out.println("i"+i);
	            String substring = s.substring(i,i+10);
	            System.out.println(substring);
	            if(allSubstrings.contains(substring)) result.add(substring);
	            allSubstrings.add(substring);
	        }
	        return new ArrayList(result);
	    }
}
