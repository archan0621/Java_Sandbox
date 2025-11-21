package Data_Structure;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {        // 빈 큐
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T dequeue() {
        if (head == null) return null;
        T val = head.data;
        head = head.next;
        if (head == null) tail = null;
        return val;
    }

    public T peek() {
        return head == null ? null : head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Queue<T> copy() {
        Queue<T> buffer = new Queue<>();
        Queue<T> out = new Queue<>();

        while (this.peek() != null) {
            buffer.enqueue(this.dequeue());
        }

        while (buffer.peek() != null) {
            T v = buffer.dequeue();
            this.enqueue(v);   // 원본 복원
            out.enqueue(v);    // 사본 구축 (원본과 같은 top 순서)
        }

        return out;
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
