package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. Single Number
 */

public class LC136 {
    void main() {
        int[] nums = new int[] {4,1,2,1,2};
        IO.println(singleNumber(nums));
    }
    
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> findOne = new HashMap<>();
        
        // Copy semua angka ke map
        for (int n : nums) {
            findOne.put(n, findOne.getOrDefault(n, 0) + 1);
        }
        
        // Cari key yang hanya mempunyai value == 1
        for (Map.Entry<Integer, Integer> entry : findOne.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
