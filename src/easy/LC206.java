package easy;

import easy.model.ListNode;

/**
 * 206. Reverse Linked List
 */

public class LC206 {
    void main() {
        int[] values = new int[] {1, 2, 3, 4, 5};
        
        IO.println("===Head===");
        ListNode head = buildList(values);
        printList(head);
        IO.println("");
        
        
        IO.println("===Reverse List===");
        ListNode result = reverseList(head);
        printList(result);
    }
    
    public ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        // 1, 2, 3, 4, 5
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    void printList(ListNode head) {
        ListNode current = head;
        
        while (current != null) {
            IO.print(current.val);
            
            if (current.next != null) {
                IO.print(" -> ");
            }
            
            current = current.next;
        }
        
        IO.println(" -> null");
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        
        // 1, 2, 3
        
        // loop-1
        // prev = null
        // curr = 1
        // next = 2
        // curr.next = prev == null
        // prev = curr == 1
        // curr = next == 2
        
        // loop-2
        // prev = 1
        // curr = 2
        // next = 3
        // curr.next = prev == 1
        // prev = curr == 2
        // curr = next == 3
        
        // loop-3
        // prev = 2
        // curr = 3
        // next = 4
        // curr.next = prev == 2
        // prev = curr == 3;
        // curr = next == 4;
        
        while (curr != null) {
            ListNode next = curr.next;  // 1. Simpan dulu nilai node berikutnya
            curr.next = prev;           // 2. Balik arah pointer
            prev = curr;                // 3. Geser prev maju
            curr = next;                // 4. Geser curr maju
        }
        
        return prev; // Prev sekarang menjadi head
    }
}
