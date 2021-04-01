import java.util.HashSet;
import java.util.Set;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        char str[] = s.toCharArray();
        System.out.println("Created By vishal");
         for(int i=0;i<str.length;i++){
             Set<Character> set = new HashSet<>();
            for(int j=i;j<str.length;j++){
			
			// Set Property - It does not contain duplicates.
			//  If in set character added successfully it returns true
			// else it return false
			
			// if specific character is not present in set then it adds and return true
			// and character already present in set and we again try to add it return false
			
                if(set.add(str[j])){
                    maxLen = Math.max(maxLen,j-i+1);
                }else break;
            }
         }     
        
        return maxLen;
    }
    
}
