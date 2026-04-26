class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    private ListNode head;
    private ListNode tail;
    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = this.head.next;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
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
        tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = head;
        while (i < index && curr.next != null) {
            i++;
            curr = curr.next;
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
        ArrayList<Integer> result = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }
        return result;
    }
}
