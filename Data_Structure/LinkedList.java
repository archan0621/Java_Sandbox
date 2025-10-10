package Data_Structure;


public class LinkedList {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.printAll();

        list.insert_node(0, 9);
        list.printAll();

        list.delete_node(4);
        list.printAll();

    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class LinkList<T> {
    Node<T> head;

    public LinkList(Node<T> head) {
        this.head = head;
    }

    public LinkList(T data) {
        this.head = new Node<>(data);
    }

    public LinkList(T... data) {
        for (T datum : data) {
            this.append(datum);
        }
    }

    public void append(T data) {
        Node<T> node = new Node<>(data);

        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> temp = this.head;

            while (true) {
                if (temp.next == null) {
                    temp.next = node;
                    return;
                }
                temp = temp.next;
            }
        }
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

    public Node<T> get_node(int pos) {
        Node<T> temp = this.head;

        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void insert_node(int pos, T data) {
        Node<T> temp = this.head;
        Node<T> node = new Node<>(data);

        if (pos == 0) {
            this.head = node;
            node.next = temp;
        } else {
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            if (temp.next != null) {
                Node<T> tempNext = temp.next;
                temp.next = node;
                node.next = tempNext;
            } else {
                temp.next = node;
            }
        }
    }

    public void delete_node(int pos) {
        if(pos == 0) {
             this.head = this.head.next;
        } else {
            Node<T> node = get_node(pos-1);

            if(node.next.next != null) {
                node.next = node.next.next;
            } else {
                node.next = null;
            }
        }

    }

}

