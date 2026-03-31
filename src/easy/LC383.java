package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 */

public class LC383 {
    void main() {
        String ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        IO.println(canConstruct(ransomNote, magazine));
    }
    
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        // Copy string ransomNote per character ke map
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Setiap ada key yang character yang sama antara ransomNote dan magazine, maka valuenya minus 1
        for (int i = 0; i < magazine.length(); i++) {
            map.computeIfPresent(magazine.charAt(i), (k, v) -> v - 1);
        }
        
        // Nilai akan true jika semua value di bawah 0,
        // yang berarti semua character magazine ada di ransomNote
        return map.values().stream().allMatch(value -> value <= 0);
    }
}
