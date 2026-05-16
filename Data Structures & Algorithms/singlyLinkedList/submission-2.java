public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;
    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head.next;
        while (i < index && curr != null) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            return -1;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        if (node.next == null) {
            tail = node;
        }
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = head;
        while (i < index && curr.next != null) {
            curr = curr.next;
            i++;
        }
        if (curr.next == null) {
            return false;
        }
        if (curr.next == tail) {
            tail = curr;
        }
        curr.next = curr.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode curr = head.next;
        while (curr != null) {
            temp.add(curr.val);
            curr = curr.next;
        }
        return temp;
    }
}
