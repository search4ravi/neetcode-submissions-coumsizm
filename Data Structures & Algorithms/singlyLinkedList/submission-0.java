class ListNode {
    int value;
    ListNode next;
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head.next;
        while(i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        if(curr == null){
            return -1;
        }
        return curr.value;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = head;
        while(i < index && curr.next != null) {
            i++;
            curr = curr.next;
        }
        if(curr.next == null){
            return false;
        }
        if(curr.next == tail){
            tail = curr;
        }
        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode curr = head.next;
        while(curr != null) {
            result.add(curr.value);
            curr = curr.next;
        }
        return result;
    }
}