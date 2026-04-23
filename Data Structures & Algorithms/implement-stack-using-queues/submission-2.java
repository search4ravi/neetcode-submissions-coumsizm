class MyStack {
    Queue<Integer> qs;

    public MyStack() {
        qs = new LinkedList<>();
    }

    public void push(int x) {
        qs.offer(x);
        for (int n = 0; n < qs.size() - 1; n++) {
            qs.offer(qs.poll());
        }
    }

    public int pop() {
        return qs.poll();
    }

    public int top() {
        return qs.peek();
    }

    public boolean empty() {
        return qs.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */