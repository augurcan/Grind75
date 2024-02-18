package Week1;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
