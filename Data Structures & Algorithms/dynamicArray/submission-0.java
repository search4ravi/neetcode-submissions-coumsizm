class DynamicArray {
    int capacity;
    int length;
    int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        length = 0;
        arr = new int[capacity];
    }

    public int get(int i) {
        if(i < length){
            return arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        if(i < capacity){
            arr[i] = n;
        }
    }

    public void pushback(int n) {
        if(length == capacity) {
            this.resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if(length > 0){
            int n = arr[length-1];
            length--;
            return n;
        }
        return -1;

    }

    private void resize() {
        capacity = 2 * capacity;
        int[] newArray = new int[capacity];
        for(int i=0; i<arr.length; i++){
            newArray[i] = arr[i];
        }
        arr = newArray;

    }

    public int getSize() {
        return length;

    }

    public int getCapacity() {
        return capacity;
    }
}
