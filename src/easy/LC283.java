package easy;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 */

public class LC283 {
    void main() {
        int[] nums = new int[] {0,1,0,3,12};
        moveZeroes(nums);
    }
    
    public void moveZeroes(int[] nums) {
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        
        IO.println(Arrays.toString(nums));
    }
}
