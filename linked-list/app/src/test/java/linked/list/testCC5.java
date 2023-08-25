package linked.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testCC5 {
    @Test    void TestForIncludeAndToString(){
        LinkedList c5 = new LinkedList();
        c5.insert(1);
        c5.insert(2);
        c5.insert(3);
        assertEquals(true,c5.includes(3));
        assertEquals(true,c5.includes(2));
        assertEquals(false,c5.includes(-1));
        assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL",c5.toString());
        c5.insert(4);
        assertEquals("{ 4 } -> { 3 } -> { 2 } -> { 1 } -> NULL",c5.toString());
    }
}
