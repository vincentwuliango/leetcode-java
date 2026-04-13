package easy;

/**
 * 643. Maximum Average Subarray I
 */

public class LC643 {
    void main() {
        int[] nums = new int[] {1,12,-5,-6,50,3};
        int k = 4;
        
        IO.println(findMaxAverage(nums, k));
    }
    
    public double findMaxAverage(int[] nums, int k) {
        int maxSum, windowSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        maxSum = windowSum;
        
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        IO.println(maxSum);
        return (double) maxSum /k;
    }
}
