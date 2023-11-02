package hashmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Hashtable<K, V> {
    private static final int INITIAL_CAPACITY = 100;
    private static final double LOAD_FACTOR = 0.75;
    public List<LinkedList<Entry<K, V>>> table;
    private int size;
    public Hashtable() {
        table = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table.add(new LinkedList<>());
        }
        size = 0;
    }
    public void set(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;

        if ((double) size / table.size() > LOAD_FACTOR) {
            resizeTable();
        }
    }
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }
    public boolean has(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }

        return false;
    }
    public Collection<K> keys() {
        List<K> keys = new ArrayList<>();
        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.key);
            }
        }
        return keys;
    }
    public int hash(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % table.size());
        return index;
    }
    private void resizeTable() {
        List<LinkedList<Entry<K, V>>> newTable = new ArrayList<>(table.size() * 2);
        for (int i = 0; i < table.size() * 2; i++) {
            newTable.add(new LinkedList<>());
        }
        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                int index = entry.key.hashCode() % (newTable.size());
                newTable.get(index).add(entry);
            }
        }
        table = newTable;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                sb.append(entry.key)
                        .append("=")
                        .append(entry.value)
                        .append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

}
