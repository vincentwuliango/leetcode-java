package easy;

import java.util.Arrays;

/**
 * 344. Reverse String
 */

public class LC344 {
    void main() {
        char[] s = new char[] {'h','e','l','l','o'};
        reverseString(s);
    }
    
    
    // Pseudocode
    // Menggunakan loop dan dimulai dari index paling akhir
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        
        IO.println(Arrays.toString(s));
    }
}
