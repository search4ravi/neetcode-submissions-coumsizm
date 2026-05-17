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
        // setting curr to head.next as head is dummy node
        ListNode curr = head.next;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        // check for index out of bound scenario
        if (curr == null) {
            return -1;
        }
        // we don't need to check for i == index because the way while and if conditions are return
        // above
        return curr.val;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        // we need to check if the tail pointer needs to be updated or not
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
        // we want to find n-1 node so that we can update the next pointer of n-1 node to remove the
        // nth node
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
        ArrayList<Integer> temp = new ArrayList<>();
        // we don't need dummy head node value
        ListNode curr = head.next;
        while (curr != null) {
            temp.add(curr.val);
            curr = curr.next;
        }
        return temp;
    }
}
