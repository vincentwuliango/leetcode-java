package easy;

/**
 * 26. Remove Duplicates from Sorted Array
 */

public class LC26 {
    void main() {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        
        IO.println(removeDuplicates(nums));
    }
    
    public int removeDuplicates(int[] nums) {
        int left = 0;
        
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++; //flag as currentIndex to move unique index from behind to here
                nums[left] = nums[right];
            }
        }
        
        for (int i = left + 1; i < nums.length; i++) {
            nums[i] = -1; // set -1 after unique index
        }
        
        return left + 1;
    }
}
