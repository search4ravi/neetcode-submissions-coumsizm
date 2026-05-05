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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> temp = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                temp.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(temp);

        ListNode result = new ListNode(-1);
        ListNode tail = result;

        for (int t : temp) {
            tail.next = new ListNode(t);
            tail = tail.next;
        }

        return result.next;
    }
}
