class DynamicArray {
    int[] arr;
    int capacity;
    int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        length = 0;
    }

    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        if (i < capacity) {
            arr[i] = n;
        }
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length++] = n;
    }

    public int popback() {
        if (length > 0) {
            // int last = arr[length - 1];
            // length--;
            // return last;
            return arr[--length];
        }
        return -1;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] temp = new int[capacity];
        for (int i = 0; i < length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
