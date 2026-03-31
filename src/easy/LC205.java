package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 */

public class LC205 {
    void main() {
        String s = "aaabbbba", t = "bbbaaaba";
        IO.println(isIsomorphic(s, t));
    }
    
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            // Cek apakah sc sudah pernah di-map sebelumnya
            if (sMap.containsKey(sc)) {
                // Kalau sudah ada, mapping-nya harus konsisten
                if (sMap.get(sc) != tc) return false;
            } else {
                // Kalau belum, pastikan tc belum di-pakai oleh karakter lain
                if (tMap.containsKey(tc)) return false;
                sMap.put(sc, tc);
                tMap.put(tc, sc);
            }
        }
        return true;
    }
}
