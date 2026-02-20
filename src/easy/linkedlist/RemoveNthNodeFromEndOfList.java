package easy.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    /*
     * // -------- BRUTE FORCE APPROACH (COUNT METHOD) --------
     * public static ListNode removeNthFromEnd(ListNode head, int n) {
     * 
     * int count = 0;
     * ListNode curr = head;
     * 
     * // Count total nodes
     * while (curr != null) {
     * count++;
     * curr = curr.next;
     * }
     * 
     * // If we need to remove head node
     * if (count == n) {
     * return head.next;
     * }
     * 
     * curr = head;
     * 
     * // Move to node before the one to delete
     * for (int i = 0; i < count - n - 1; i++) {
     * curr = curr.next;
     * }
     * 
     * // Remove node
     * curr.next = curr.next.next;
     * 
     * return head;
     * }
     */

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.println("After Removing " + n + "th Node From End:");
        printList(head);
    }
}
