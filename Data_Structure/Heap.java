package Data_Structure;

public class Heap {
    private final int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity + 1]; // 1-based 인덱스
        size = 0;
    }

    public void insert(int value) {
        heap[++size] = value; // 마지막 위치에 삽입
        int current = size;

        // 부모보다 작으면 교환 (위로 올라감)
        while (current > 1 && heap[current] < heap[current / 2]) {
            swap(current, current / 2);
            current /= 2;
        }
    }

    public int delete() {
        if (size == 0) {
            return 0;
        }

        int min = heap[1];
        heap[1] = heap[size];
        heap[size--] = 0;
        int current = 1;

        while (true) {
            int left = current * 2;
            int right = current * 2 + 1;

            if (left > size) {
                break;
            }

            int smaller = left;

            if( right <= size) {
                if (heap[right] < heap[left]) {
                    smaller = right;
                }
            }

            // 부모가 더 작거나 같으면 힙 성립 → 종료
            if (heap[current] <= heap[smaller]) {
                break;
            }

            swap(current, smaller);       // 부모와 더 작은 자식 교환
            current = smaller;
        }

        return min;                       // 5) 삭제된 최소값 반환
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        heap.print(); // 1 3 8 5

        System.out.println(heap.delete());

        heap.print();
    }
}