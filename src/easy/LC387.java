package easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 */

public class LC387 {
    void main() {
        String s = "loveleetcode";
        IO.println(firstUniqueChar(s));
    }
    
    public int firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return s.indexOf(entry.getKey());
        }
        
        return -1;
    }
}
