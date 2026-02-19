package easy.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        ListNode temp = head;
        ListNode curr = head.next;

        while (curr != null) {

            if (temp.val == curr.val) {
                temp.next = curr.next;
                curr = curr.next;
            } else {
                temp = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}
