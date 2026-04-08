package easy;

/**
 * 125. Valid Palindrome
 */

public class LC125 {
    void main() {
        String s = " ";
        IO.println(isPalindrome(s));
    }
    
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }
}
