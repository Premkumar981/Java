class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
        DynamicArray arr = new DynamicArray();

        for(int i = 0; i < 45; ++i) {
            System.out.println(arr.size() + " - " + arr.capacity());
            arr.add(i);
        }
    }
}

class DynamicArray {
    private int arr[];
    private int capacity = 10;
    private int size = 0;

    DynamicArray() {
        arr = new int[10];
        size = 0;
        capacity = 10;
    }

    void add(int num) {
        // We've to double the capacity
        if(size == capacity) {
            int newArr[] = new int[2*capacity];

            // Copy the elements from the old array.
            for(int i = 0; i < capacity; ++i)
                newArr[i] = arr[i];

            // Now, we have to start using the
            // new array for storing the elements.
            this.arr = newArr;

            capacity *= 2;
        }

        arr[size] = num;
        size++;
    }

    void remove_back() {
        if(size > 0) {
            this.arr[size-1] = 0;
            size--;
        }
    }

    void set(int id, int num) {
        if(id >= 0 && id < size) {
            this.arr[id] = num;
        }
    }

    int get(int id) {
        if(id >= 0 && id < size)
            return this.arr[id];

        return -1; // Ideally, an exception should be shown.
    }

    int size() {
        return this.size;
    }

    int capacity() {
        return this.capacity;
    }
}