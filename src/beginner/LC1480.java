package beginner;

import java.util.Arrays;

/**
 * 1480. Running Sum of 1D Array
 */

public class LC1480 {
    void main() {
        int[] nums = new int[] {3, 1, 2, 10, 1};
        IO.println(Arrays.toString(sumArray(nums)));
    }
    
    public int[] sumArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        
        for (int i = 0; i < nums.length - 1; i++) {
            result[i+1] = result[i] + nums[i+1];
        }
        
        return result;
    }
}
