package easy;

import easy.model.ListNode;

/**
 * 876. Middle of the Linked List
 */

public class LC876 {
    void main() {
        int[] values = new int[] {1,2,3,4,5,6};
        ListNode head = buildList(values);
        ListNode result = middleNode(head);
        printList(result);
    }
    
    ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
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
    
    ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;
        
        while (current != null) {
            count++;
            current = current.next;
        }
        
        int index = (count / 2) + 1;
        
        while (index > 1) {
            if (head.next != null) {
                head = head.next;
            }
            
            index--;
        }
        
        return head;
    }
}
