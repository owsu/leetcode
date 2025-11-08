/* Github Medium Problem
Basically what we are doing is creating a Listnode, which we will use as an output, then looping through the two given listnodes whenever possible.
If there is a value then we use the value of the listnode, if not then we pretend that value is 0. Then we add the two values + the carry
since numbers > 9 will result in a carry. To calculate the carry we just say that the value is = to the value divided by 10 and java
always rounds down anyways. And the value is the value without the 10s place which is just mod 10. Then we assign that value to current.next
And  we iterate by setting current to current.next and l1 & l2 to l1/l2.next. Since we are creating our own node and we are looping through
the two nodes our time and space complexity will come out to O(N + M) size, it mainly depending on whatever is bigger, N or M.


*/
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
