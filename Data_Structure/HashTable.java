package Data_Structure;


import java.util.Objects;

public class HashTable<K, V> {
    int initLength = 16;

    NodeTuple<K, V>[] table = new NodeTuple[initLength];

    public void put(K key, V value) {
        int hash = Objects.hashCode(key);
        int index = hash & (initLength - 1);

        NodeTuple<K, V> head = table[index];

        for (NodeTuple<K, V> n = head; n != null; n = n.next) {
            if (n.hash == hash && Objects.equals(n.key, key)) {
                n.value = value;
                return;
            }
        }

        NodeTuple<K, V> newNode = new NodeTuple<>(hash, key, value, head);
        table[index] = newNode;
    }

    public V get(K key) {
        int hash = Objects.hashCode(key);
        int index = hash & (initLength - 1);

        NodeTuple<K, V> head = table[index];

        for (NodeTuple<K, V> n = head; n != null; n = n.next) {
            if (n.hash == hash && Objects.equals(n.key, key)) {
                return n.value;
            }
        }

        return null;
    }

}

class NodeTuple<K, V> {
    final int hash;
    final K key;
    V value;
    NodeTuple<K, V> next;

    NodeTuple(int hash, K key, V value, NodeTuple<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }
}