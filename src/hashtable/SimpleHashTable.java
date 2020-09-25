package hashtable;

public class SimpleHashTable {

    int size;

    Node[] slots;

    class Node {

        int key;

        int value;

        Node next;

    }

    public SimpleHashTable(int size) {
        this.size = size;
        this.slots = new Node[size];
    }

    private int hashCode(int k) {
        if (k < 0) {
            return - ( k % this.size );
        } else {
            return k % this.size;
        }
    }

    public void insert(int k, int v) {
        int pos = hashCode(k);
        Node tmp = this.slots[pos];
        while (tmp != null) {
            if (tmp.key == k) {
                tmp.value = v;
                return;
            }
            tmp = tmp.next;
        }

        Node newNode = new Node();
        newNode.key = k;
        newNode.value = v;
        newNode.next = this.slots[pos];
        this.slots[pos] = newNode;
    }

    public int lookup(int k) {
        int pos = hashCode(k);
        Node tmp = this.slots[pos];
        while (tmp != null) {
            if (tmp.key == k) {
                return tmp.value;
            }
            tmp = tmp.next;
        }
        return -1;
    }
}
