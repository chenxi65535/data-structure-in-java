import hashtable.SimpleHashTable;

public class Main {

    public static void main(String[] args) {
        SimpleHashTable simpleHashTable = new SimpleHashTable(5);
        for (int i=0; i <= 10; i++) {
            simpleHashTable.insert(i, 10-i);
        }
        for (int i=0; i <= 10; i++) {
            System.out.println(i + " -> " + simpleHashTable.lookup(i));
        }
    }
}
