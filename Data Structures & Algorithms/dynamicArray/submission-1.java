class DynamicArray {
    int capacity;
    int length = 0;
    int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
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
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            length--;
            return arr[length];
        }
        return -1;
    }

    private void resize() {
        capacity = 2 * capacity;
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
