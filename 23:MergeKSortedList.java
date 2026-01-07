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

/**
Leetcode Hard Problem

This is the idea:
1. Make a priority queue (a data structure that sorted its items like a min heap
2. Loop through all of the lists and add it into the prio queue so its auto sorted
3. Create the ListNode to output
4. Loop through the prio queue, get the head (smallest value) and set our "current" (the tail) to smallest, and iterate
5. Update the queue since the prio queue only sorts by the head of the linked list, so we offer up everything but the head this time
6. Output the dummy node

In theory, the prio queue is taking on o(k) space which is # nodes
In theory, looping through the prio queue is o(n) but poll is log(k) just because of how heaps work. so overall it is O(nlog(k))

**/
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> myQ = new PriorityQueue<>((a,b) -> a.val - b.val);

        for (ListNode head : lists) {
            if (head != null) {
                myQ.offer(head);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!myQ.isEmpty()) {
            ListNode min = myQ.poll();
            tail.next = min;
            tail = tail.next;

            if (min.next != null) {
                myQ.offer(min.next);
            }
        }

        return dummy.next;
    }
}
