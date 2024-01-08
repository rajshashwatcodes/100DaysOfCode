public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }

    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert element: " + element);
            return;
        }

        size++;
        heap[size] = element;
        int currentIndex = size;

        // Maintain the heap property by comparing with parent nodes
        while (currentIndex > 1 && heap[currentIndex] < heap[currentIndex / 2]) {
            swap(currentIndex, currentIndex / 2);
            currentIndex = currentIndex / 2;
        }
    }

    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract minimum element.");
            return -1; // Assuming -1 represents an error or an empty heap
        }

        int min = heap[1];
        heap[1] = heap[size];
        size--;

        // Maintain the heap property by comparing with child nodes
        heapify(1);

        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int leftChild = 2 * index;
        int rightChild = 2 * index + 1;

        // Compare with left child
        if (leftChild <= size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }

        // Compare with right child
        if (rightChild <= size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        // Swap if needed and recursively heapify the affected sub-tree
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.print("Min Heap: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(4);

        minHeap.printHeap();

        System.out.println("Extracted Min: " + minHeap.extractMin());
        minHeap.printHeap();
    }
}
