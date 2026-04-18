class MyStack {
    Queue<Integer> qs;
    Queue<Integer> temp;

    public MyStack() {
        qs = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!qs.isEmpty()){
            temp.offer(qs.poll());
        }
        qs.offer(x);
        while(!temp.isEmpty()){
            qs.offer(temp.poll());
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