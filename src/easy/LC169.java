package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 */

public class LC169 {
    void main() {
        int[] nums  = new int[] {3,2,3};
        IO.println(majorityElement(nums));
    }
    
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Copy semua angka ke dalam map
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        // Mencari key yang value nya lebih besar dari nums.length / 2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        }
        
        return 0;
    }
}
