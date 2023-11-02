package hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {

    @Test
    public void testSetAndGet() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("apple", 5);
        assertEquals(5, hashtable.get("apple"));
    }

    @Test
    public void testNullForNonExistingKey() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        assertNull(hashtable.get("nonexistent"));
    }

    @Test
    public void testUniqueKeys() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("apple", 5);
        hashtable.set("banana", 3);
        hashtable.set("cherry", 8);

        assertEquals(3, hashtable.keys().size());
    }

    @Test
    public void testCollisionHandling() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("apple", 5);
        hashtable.set("pale", 3); // Collides with "apple"
        assertEquals(5, hashtable.get("apple"));
        assertEquals(3, hashtable.get("pale"));
    }

    @Test
    public void testHashInRange() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int hash = hashtable.hash("apple");
        assertTrue(hash >= 0 && hash < hashtable.table.size());
    }
    @Test
    public void testAllHash() {

        Hashtable<String, Integer> h = new Hashtable<>();

        h.set("apple", 5);
        h.set("ap", 8);
        h.set("apas", 344);
        h.set("ap", 8);
        h.set("ahmad", 344);
        h.set("ali", 8);
        h.set("ahmad", 5);
        h.set("mohammed", 8);
        h.set("Qais".toLowerCase(), 344);
        h.set("alaa", 8);
        h.set("haithem", 344);
        h.set("khaled", 8);
        assertEquals("{haithem=344, khaled=8, apple=5, ap=8, alaa=8, ahmad=5, ali=8, qais=344, apas=344, mohammed=8}", h.toString());
    }
}
