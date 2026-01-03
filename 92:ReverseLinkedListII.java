// LeetCode Medium

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeLeft = dummy;

        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        ListNode current = beforeLeft.next;
        ListNode leftNode = current;
        ListNode prev = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        beforeLeft.next = prev;
        leftNode.next = current;

        return dummy.next;
    }
}
