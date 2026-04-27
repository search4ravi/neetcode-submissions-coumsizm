class DualListNode {
    int val;
    DualListNode next;
    DualListNode prev;
    public DualListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class Deque {
    private DualListNode head;
    private DualListNode tail;

    public Deque() {
        this.head = new DualListNode(-1);
        this.tail = new DualListNode(-1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    public void append(int value) {
        DualListNode node = new DualListNode(value);
        node.next = tail;
        node.prev = tail.prev;

        if (tail.prev != null) {
            tail.prev.next = node;
            tail.prev = node;
        } else {
            tail.prev = node;
        }
    }

    public void appendleft(int value) {
        DualListNode node = new DualListNode(value);
        node.next = head.next;
        node.prev = head;

        if (head.next != null) {
            head.next.prev = node;
            head.next = node;
        } else {
            head.next = node;
        }
    }

    public int pop() {
        int ans = tail.prev.val;
        if (tail.prev == head) {
            return -1;
        } else {
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
        }
        return ans;
    }

    public int popleft() {
        int ans = head.next.val;
        if (head.next == tail) {
            return -1;
        } else {
            head.next.next.prev = head;
            head.next = head.next.next;
        }
        return ans;
    }
}
