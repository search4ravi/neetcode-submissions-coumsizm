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
    public ListNode reverseList(ListNode head) {

        ListNode result = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextCurrent = curr.next;
            curr.next = result;
            result = curr;
            curr = nextCurrent;
        }

        return result;
        
    }
}
