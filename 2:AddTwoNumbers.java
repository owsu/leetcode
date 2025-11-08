// Github Medium

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outputNode = new ListNode();
        ListNode current = outputNode;
        int carry = 0;

        while ((l1 != null) || (l2 != null) || (carry != 0)) {
            int value1 = 0;
            if (l1 != null) {
                value1 = l1.val;
            }

            int value2 = 0;
            if (l2 != null) {
                value2 = l2.val;
            }
            

            int val = value1 + value2 + carry;
            carry = val / 10;
            val = val % 10;
            current.next = new ListNode(val);

            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }
            
            if (l2 != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
        }

        return outputNode.next;

    }
}
