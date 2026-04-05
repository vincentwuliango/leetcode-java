package easy;

import easy.model.ListNode;

/**
 * 21. Merge Two Sorted Lists
 */

public class LC21 {
    void main() {
//        int[] values = new int[]{1, 2, 3, 4, 5};
//        printList(buildList(values));
        
        int[] values1 = new int[]{1, 2, 4};
        int[] values2 = new int[]{1, 3, 4, 5};
        ListNode list1 = buildList(values1);
        ListNode list2 = buildList(values2);
        printList(list1);
        printList(list2);
        
//        printList(mergeTwoLists(list1, list2));
        printList(mergeTwoListsWithRecursive(list1, list2));
    }
    
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }
        
        current.next = (list1 != null) ? list1 : list2;
        
        return dummy.next;
    }
    
    ListNode mergeTwoListsWithRecursive(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return (list1 != null) ? list1 : list2;
        }
        
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        
        list1.next = mergeTwoListsWithRecursive(list1.next, list2);
        return list1;
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
            
            if (current.next !=null) {
                IO.print(" -> ");
            }
            
            current = current.next;
        }
        
        IO.println(" -> null ");
    }
}
