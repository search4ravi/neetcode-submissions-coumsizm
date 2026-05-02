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
        List<Integer> nodes = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                nodes.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(nodes);

        ListNode result = new ListNode(-1);
        ListNode tail = result;

        for (int i = 0; i < nodes.size(); i++) {
            tail.next = new ListNode(nodes.get(i));
            tail = tail.next;
        }
        return result.next;
    }
}
