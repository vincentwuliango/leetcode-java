package easy;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 */

public class LC88 {
    void main() {
        int[] nums1 = new int[] {1,2,3,0,0,0}, nums2 = new int[] {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Mengambil angka dari nums2 dari awal sampai n(3)
        // Lalu menimpanya, mulai dari index ke-m(3) nums1
//        System.arraycopy(nums2, 0, nums1, m, n);
        
        // Lalu sort ascending, sesuai dengan expected result untuk solve problem ini
//        Arrays.sort(nums1);
        
        int mIndex = m - 1;
        int nIndex = n - 1;
        int lastIndex = m + n - 1;
        
        // Lakukan pengulangan sebanyak nIndex karena kita mengambil angka sebanyak n yang diperlukan dari nums2
        while (nIndex >= 0) {
            if (mIndex >= 0 &&  nums1[mIndex] > nums2[nIndex]) {
                nums1[lastIndex] = nums1[mIndex];
                mIndex--;
            } else {
                nums1[lastIndex] = nums2[nIndex];
                nIndex--;
            }
            
            lastIndex--;
        }
        
        IO.println(Arrays.toString(nums1));
    }
}
