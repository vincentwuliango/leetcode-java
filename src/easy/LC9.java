package easy;

import java.util.Arrays;

/**
 * 9. Palindrome Number
 */

public class LC9 {
    void main() {
        int x = 101;
        IO.println(isPalindrome(x));
    }
    
    public boolean isPalindrome(int x) {
        int[] xDigit = String.valueOf(x)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        int left = 0;
        int right = xDigit.length - 1;
        
        while (left < right) {
            if (xDigit[left] != xDigit[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        IO.println(Arrays.toString(xDigit));
        return true;
    }
}
