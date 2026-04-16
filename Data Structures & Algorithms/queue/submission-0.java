public class DualLinkedList {
    int val;
    DualLinkedList next;
    DualLinkedList prev;

    public DualLinkedList() {}

    public DualLinkedList(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class Deque {
    DualLinkedList head;
    DualLinkedList tail;

    public Deque() {
        this.head = new DualLinkedList();
        this.tail = new DualLinkedList();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    public void append(int value) {
        DualLinkedList node = new DualLinkedList(value);
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
        DualLinkedList node = new DualLinkedList(value);
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
        int val = tail.prev.val;
        DualLinkedList curr = tail.prev;
        if (curr != head) {
            curr.prev.next = tail;
            curr.next.prev = curr.prev;
        } else {
            return -1;
        }
        return val;
    }

    public int popleft() {
        int val = head.next.val;
        DualLinkedList curr = head.next;
        if (curr != tail) {
            curr.next.prev = head;
            curr.prev.next = curr.next;
        } else {
            return -1;
        }
        return val;
    }
}
