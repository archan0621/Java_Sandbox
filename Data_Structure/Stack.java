package Data_Structure;

public class Stack<T> {
    Node<T> head;

    public void push(T data) {
        Node<T> currentNode = new Node<>(data);
        Node<T> tmpNode = this.head;
        this.head = currentNode;
        currentNode.next = tmpNode;
    }

    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        Node<T> tmpNode = this.head;
        this.head = tmpNode.next;
        return tmpNode.data;
    }

    public Stack<T> copy() {
        Stack<T> buffer = new Stack<>();
        Stack<T> out = new Stack<>();

        while (this.peek() != null) {
            buffer.push(this.pop());
        }

        while (buffer.peek() != null) {
            T v = buffer.pop();
            this.push(v);   // 원본 복원
            out.push(v);    // 사본 구축 (원본과 같은 top 순서)
        }

        return out;
    }


    public void printAll() {
        Node<T> temp = this.head;

        if (temp == null) {
            System.out.println("리스트가 비어 있습니다.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.printAll();
        stack.push(1);
        stack.printAll();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printAll();
        Integer pop = stack.pop();
        System.out.println("pop : " + pop);
        stack.printAll();
        Integer peek = stack.peek();
        System.out.println("peek : " + peek);
        stack.printAll();
    }
}